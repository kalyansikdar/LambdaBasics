package Unit2;

import Common.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // This is latest for loop with always giving actually
        for (int i = 0; i < people.size(); i ++) {
            System.out.println (people.get(i));
        }
        // For each loop with older Java versiob
        for (Person person : people)
            System.out.println(person);

        // For each loop to be used with Streams
        people.forEach((person -> System.out.println("Printing from Java 8 for each: " + person)));

        // print only the firstname of the people whose lastname starts with C
        people.stream().filter(p -> p.getLastName().startsWith("C")).forEach(p -> System.out.println(p.getFirstName()
        ));
    }
}
