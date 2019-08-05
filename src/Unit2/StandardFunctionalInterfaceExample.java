package Unit2;

import Common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));
//        Collections.sort(people, Comparator.comparing(Person::getLastName));      // alternate method

        System.out.println("Print all people... ");
        printConditionally(people, person -> true, person -> System.out.println(person));

        System.out.println("Print all people whose last name starts with C... ");
        printConditionally(people, person -> person.getLastName().startsWith("C"), person -> System.out.println(person.getLastName()));

        System.out.println("Print all people whose last name ends with E...");
        printConditionally(people, person -> person.getLastName().endsWith("e"), person -> System.out.println(person.getFirstName()
                + " " + person.getLastName()));
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person: people) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}

