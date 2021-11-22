package practicejava.generics;

public class MainGenerics {
    public static void main(String[] args) {
        NotParametrizedClass notParametrizedClass = new NotParametrizedClass("Hello", "World!");
        System.out.println((String) notParametrizedClass.concatValues());
    }
}
