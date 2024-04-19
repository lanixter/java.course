package lr5;

public class Example1 {

    private char ch;

    public void set(char newValue) {
        ch = newValue;
    }

    public int getCode() {
        int code = (int) ch;
        return code;
    }

    public void description() {
        System.out.printf("Character: %c (code: %d)", ch, getCode());
    }

    public static void main(String[] args) {
        Example1 one = new Example1();
        one.set('a');
        one.description();
    }

}