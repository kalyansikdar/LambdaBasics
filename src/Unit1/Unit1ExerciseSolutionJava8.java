package Unit1;

import Common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        Collections.sort(people, (person1, person2) -> person1.getLastName().compareTo(person2.getLastName()));

        System.out.println("Print all people... ");
        printConditionally(people, person -> true);

        System.out.println("Print all people whose last name starts with C... ");
        printConditionally(people, person -> person.getLastName().startsWith("C"));

        System.out.println("Print all people whose last name ends with E...");
        printConditionally(people, person -> person.getLastName().endsWith("e"));
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person: people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }

public interface Condition {
    boolean test(Person person);
}
}
