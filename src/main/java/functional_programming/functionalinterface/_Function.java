package functional_programming.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function
        int increment = incrementByOne(0);
        System.out.println(increment);

        System.out.println(incrementByOneFunction.apply(0));

        int multiply = multiplyBy10.apply(2);
        System.out.println(multiply);

        Function<Integer, Integer> integerIntegerFunction = incrementByOneFunction
                .andThen(multiplyBy10)
                .andThen(multiplyBy10)
                .andThen(incrementByOneFunction);
        System.out.println(integerIntegerFunction.apply(2));

        //BiFunction
        System.out.println(incrementByOneAndMultiply(1, 10));
        System.out.println(incrementByOneAndMultiplyFunction.apply(1, 10));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int incrementByOne(int number) {
        return ++number;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction = (a, b) -> ++a * b;

    static int incrementByOneAndMultiply(int number, int numToMultiply) {
        return ++number * numToMultiply;
    }

}