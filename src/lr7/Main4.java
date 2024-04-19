package lr7;

class FirstClass4 {
    public char charField;

    public FirstClass4(char charField) {
        this.charField = charField;
    }

    public FirstClass4(FirstClass4 original) {
        this.charField = original.charField;
    }
}

class SecondClass4 extends FirstClass4 {
    public String textField;

    public SecondClass4(char charField, String textField) {
        super(charField);
        this.textField = textField;
    }

    public SecondClass4(SecondClass4 original) {
        super(original.charField);
        this.textField = original.textField;
    }
}

class ThirdClass4 extends SecondClass4 {
    public int intField;

    public ThirdClass4(char charField, String textField, int intField) {
        super(charField, textField);
        this.intField = intField;
    }

    public ThirdClass4(ThirdClass4 original) {
        super(original.charField, original.textField);
        this.intField = original.intField;
    }
}

public class Main4 {
    public static void main(String[] args) {
        ThirdClass4 original = new ThirdClass4('A', "Hello", 10);
        ThirdClass4 copy = new ThirdClass4(original);

        System.out.println("Original: charField = " + original.charField + ", textField = " + original.textField + ", intField = " + original.intField);
        System.out.println("Copy: charField = " + copy.charField + ", textField = " + copy.textField + ", intField = " + copy.intField);
    }
}