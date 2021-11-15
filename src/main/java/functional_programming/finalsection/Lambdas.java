package functional_programming.finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> upperCaseNameV2 = (name, age) -> {
            if (name.isBlank()) {
                throw new IllegalArgumentException("");
            }
            return name.toUpperCase();
        };

        Function<String, String> upperCaseName = name -> {
            if (name.isBlank()) {
                throw new IllegalArgumentException("");
            }
            return name.toUpperCase();
        };
    }

}