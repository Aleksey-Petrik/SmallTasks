package functional_programming.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static functional_programming.streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)//,
                //new Person("Bob", TRANSGENDER)
        );

        people.stream().map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        people.stream().map(personStringFunction)
                .mapToInt(length)
                .forEach(println);

        people.stream().map(Person::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean isAllFemale = people.stream()
                .allMatch(personPredicate);//точное совпадение с предикатом
        System.out.println(isAllFemale);

        boolean isAnyFemale = people.stream()
                .anyMatch(personPredicate);//хотя бы одно совпадение с предикатом
        System.out.println(isAnyFemale);

        Predicate<Person> personTRANSGENDER = person -> TRANSGENDER.equals(person.gender);
        boolean isPersonTRANSGENDER = people.stream().noneMatch(personTRANSGENDER);
        System.out.println(isPersonTRANSGENDER);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, TRANSGENDER
    }

}