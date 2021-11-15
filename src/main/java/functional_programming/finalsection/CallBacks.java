package functional_programming.finalsection;

import java.util.function.Consumer;

public class CallBacks {
    public static void main(String[] args) {
        hello("Alex", null, firstName -> System.out.println(firstName + " lastName no provided"));
        helloV2("Alex", null, () -> System.out.println("LastName no provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void helloV2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

}