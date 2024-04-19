package lr7;

class Superclass3 {
    public int intValue;

    public Superclass3(int intValue) {
        this.intValue = intValue;
    }

    public void setValue(int value) {
        this.intValue = value;
    }

    @Override
    public String toString() {
        return "Superclass3: intValue = " + intValue;
    }
}

class Subclass13 extends Superclass3 {
    public char charValue;

    public Subclass13(int intValue, char charValue) {
        super(intValue);
        this.charValue = charValue;
    }

    public void setValues(int intValue, char charValue) {
        super.setValue(intValue);
        this.charValue = charValue;
    }

    @Override
    public String toString() {
        return "Subclass13: intValue = " + intValue + ", charValue = " + charValue;
    }
}

class Subclass23 extends Subclass13 {
    public String stringValue;

    public Subclass23(int intValue, char charValue, String stringValue) {
        super(intValue, charValue);
        this.stringValue = stringValue;
    }

    public void setValues(int intValue, char charValue, String stringValue) {
        super.setValues(intValue, charValue);
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return "Subclass23: intValue = " + intValue + ", charValue = " + charValue + ", stringValue = " + stringValue;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Superclass3 superClass = new Superclass3(10);
        System.out.println(superClass);

        Subclass13 subclass1 = new Subclass13(20, 'A');
        System.out.println(subclass1);

        Subclass23 subclass2 = new Subclass23(30, 'B', "Hello");
        System.out.println(subclass2);
    }
}
