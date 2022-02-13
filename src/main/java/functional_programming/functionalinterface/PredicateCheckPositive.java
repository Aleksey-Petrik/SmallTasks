package functional_programming.functionalinterface;

import java.util.function.Predicate;

public class PredicateCheckPositive {

    public static void main(String[] args) {
        System.out.println(PredicateCheckPositive.check(1));
        System.out.println(PredicateCheckPositive.check(-1));
        System.out.println(PredicateCheckPositive.check(0));
    }

    public static boolean check(int num) {
        return check(val -> val > 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
