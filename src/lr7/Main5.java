package lr7;

class Superclass5 {
    protected String text;

    public Superclass5(String text) {
        this.text = text;
    }

    public void displayInfo() {
        System.out.println("Class: " + getClass().getSimpleName() + ", Text: " + text);
    }
}

class Subclass15 extends Superclass5 {
    protected int intValue;

    public Subclass15(String text, int intValue) {
        super(text);
        this.intValue = intValue;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class: " + getClass().getSimpleName() + ", Text: " + text + ", intValue: " + intValue);
    }
}

class Subclass25 extends Superclass5 {
    protected char charValue;

    public Subclass25(String text, char charValue) {
        super(text);
        this.charValue = charValue;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class: " + getClass().getSimpleName() + ", Text: " + text + ", charValue: " + charValue);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Subclass15 subclass15 = new Subclass15("Subclass1 Text", 10);
        Subclass25 subclass25 = new Subclass25("Subclass2 Text", 'A');

        subclass15.displayInfo();
        subclass25.displayInfo();

        Superclass5 superClass15 = new Subclass15("Superclass1 Text", 20);
        Superclass5 superClass25 = new Subclass25("Superclass2 Text", 'B');

        superClass15.displayInfo();
        superClass25.displayInfo();
    }
}