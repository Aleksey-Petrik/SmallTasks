package functional_programming.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Maria", "999999"));
        greetCustomerCustomer.accept(new Customer("Alex", "88888"));
        greetCustomerCustomerV2.accept(new Customer("Alex", "88888"), false);
    }

    static Consumer<Customer> greetCustomerCustomer = customer -> System.out.println("HEllo " + customer.customerName + " your phone number " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerCustomerV2 = (customer, showPhoneNumber) ->
            System.out.println("HEllo " + customer.customerName + " your phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "**************"));

    static void greetCustomer(Customer customer) {
        System.out.println("HEllo " + customer.customerName + " your phone number " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}