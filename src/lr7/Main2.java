package lr7;

class Example2 {
    private String text;

    public Example2(String text) {
        this.text = text;
    }

    public void setText() {
        this.text = "";
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLength() {
        return text.length();
    }
}

class Subclass2 extends Example2 {
    public int additionalField;

    public Subclass2(int intValue, String text) {
        super(text);
        this.additionalField = intValue;
    }

    public void setText() {
        super.setText();
    }

    public void setText(String text) {
        super.setText(text);
    }

    public void setAdditionalField(int intValue) {
        this.additionalField = intValue;
    }

    public void setValues(String text, int intValue) {
        super.setText(text);
        this.additionalField = intValue;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Subclass2 subclass = new Subclass2(5, "Hello");

        System.out.println("Длина текста: " + subclass.getLength());
        System.out.println("Дополнительное поле: " + subclass.additionalField);

        subclass.setText("World");
        subclass.setAdditionalField(10);

        System.out.println("Длина текста после изменения: " + subclass.getLength());
        System.out.println("Дополнительное поле после изменения: " + subclass.additionalField);
    }
}