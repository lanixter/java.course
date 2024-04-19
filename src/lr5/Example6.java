package lr5;

public class Example6 {
    private char charField;
    private String textField;

    public void setValue(char value) {
        charField = value;
    }

    public void setValue(String value) {
        textField = value;
    }

    public void setValue(char[] value) {
        if (value.length == 1) {
            charField = value[0];
        } else {
            textField = new String(value);
        }
    }

    public static void main(String[] args) {
        Example6 obj = new Example6();

        // Присваиваем значение символьному полю
        obj.setValue('A');
        System.out.println("Char field: " + obj.charField);

        // Присваиваем значение текстовому полю
        obj.setValue("Hello");
        System.out.println("Text field: " + obj.textField);

        // Присваиваем значение символьному полю с помощью массива
        char[] charArray = {'B'};
        obj.setValue(charArray);
        System.out.println("Char field from array: " + obj.charField);

        // Присваиваем значение текстовому полю с помощью массива
        char[] textArray = {'W', 'o', 'r', 'l', 'd'};
        obj.setValue(textArray);
        System.out.println("Text field from array: " + obj.textField);
    }
}
