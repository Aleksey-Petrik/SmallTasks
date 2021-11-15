package functional_programming.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000001"));
        System.out.println(isPhoneNumberValid("070000000012"));

        System.out.println(isPhoneNumberValidPredicate.test("07000000001"));
        System.out.println(isPhoneNumberValidPredicate.test("070000000012"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000300012"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String>containsNumber3 = phoneNumber -> phoneNumber.contains("3");

}