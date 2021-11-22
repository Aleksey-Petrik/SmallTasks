package practicejava.generics;

public class ParametrizedClass<T> {
    private final T firstValue;
    private final T secondValue;

    public ParametrizedClass(T firstValue, T secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public T getSecondValue() {
        return secondValue;
    }

    public void printValue() {
        System.out.println(firstValue + "/" + secondValue);
    }

}
