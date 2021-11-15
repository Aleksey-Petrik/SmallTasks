package functional_programming.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("null").orElseGet(() -> "default value");
        System.out.println(value);
        //Object value2 = Optional.ofNullable(null).orElseThrow(()-> new IllegalArgumentException());

        Optional.ofNullable("john@mail.com").ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null).ifPresentOrElse(
                email -> System.out.println("Sending email to " + email),
                () -> System.out.println("Cannot send email"));
    }

}