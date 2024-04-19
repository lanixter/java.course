package lr6;
public class Example1 {
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
        Example1 obj = new Example1();


        obj.setValue('A');
        System.out.println("Char field: " + obj.charField);


        obj.setValue("Hello");
        System.out.println("Text field: " + obj.textField);


        char[] charArray = {'B'};
        obj.setValue(charArray);
        System.out.println("Char field from array: " + obj.charField);


        char[] textArray = {'W', 'o', 'r', 'l', 'd'};
        obj.setValue(textArray);
        System.out.println("Text field from array: " + obj.textField);
    }
}