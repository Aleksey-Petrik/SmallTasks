package functional_programming.commbinatorpattern;

import java.time.LocalDate;

import static functional_programming.commbinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@mail.com",
                "+0123456789",
                LocalDate.of(2000, 1, 1)
        );

        CustomerValidatorService validatorService = new CustomerValidatorService();
        validatorService.isValid(customer);

        ValidatorResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdultValid()).apply(customer);
        System.out.println(result);
    }

}