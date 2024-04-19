package lr7;

class Example1 {
    private String text;

    public Example1(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Example1: " + text;
    }
}

class Subclass extends Example1 {
    private String additionalText;

    public Subclass(String text, String additionalText) {
        super(text);
        this.additionalText = additionalText;
    }

    public Subclass(String text) {
        this(text, "");
    }

    @Override
    public String toString() {
        return "Subclass: " + super.toString() + ", additionalText: " + additionalText;
    }
}

public class Main {
    public static void main(String[] args) {
        Example1 example1 = new Example1("lr");
        System.out.println(example1);

        Subclass subClassWithOneArg = new Subclass("7");
        System.out.println(subClassWithOneArg);

        Subclass subClassWithTwoArgs = new Subclass("Example", "1");
        System.out.println(subClassWithTwoArgs);
    }
}