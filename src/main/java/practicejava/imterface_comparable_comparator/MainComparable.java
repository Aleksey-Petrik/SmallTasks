package practicejava.imterface_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparable {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Semen", "Sidors", 5000.00d));
        employees.add(new Employee(1, "Ivan", "Ivanov", 2000.00d));
        employees.add(new Employee(4, "Bob", "Bumble", 1000.00d));
        employees.add(new Employee(2, "Petr", "Petrov", 3000.00d));
        employees.add(new Employee(4, "Aleksey", "Doors", 4000.00d));

        System.out.println("Before sort : " + employees);
        Collections.sort(employees);
        System.out.println("After sort : " + employees);

        employees.sort(Comparator.comparingInt(Employee::getId));
        System.out.println("After sort : " + employees);

        employees.sort(Comparator.comparingInt(Employee::getId).thenComparing(Employee::getFirstName));
        System.out.println("After sort : " + employees);

        employees.sort(new SortFirstName());
        System.out.println("Comparator SortFirstName : " + employees);

        employees.sort(new SortLastName());
        System.out.println("Comparator SortLastName : " + employees);

        employees.sort(new SortSalary());
        System.out.println("Comparator SortSalary : " + employees);

    }

    static class SortFirstName implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

    static class SortLastName implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    static class SortSalary implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary() - o2.getSalary());
        }
    }

}


