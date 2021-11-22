package practicejava.generics;

public class NotParametrizedClass {
    private final String firstValue;
    private final String secondValue;

    public NotParametrizedClass(String firstValue, String secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public <T> T concatValues() {
        return (T) firstValue.concat(" ").concat(secondValue);
    }
}
