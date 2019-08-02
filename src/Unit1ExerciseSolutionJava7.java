import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        Collections.sort(people, new Comparator<>() {

            @Override
            public int compare(Person person1, Person person2) {
                return person1.getLastName().compareTo(person2.getLastName());
            }
        });

        System.out.println("Print all people... ");
        printAllPersons(people);

        System.out.println("Print all people whose name starts with C... ");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });

        System.out.println("Print all people whose name ends with E...");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().endsWith("e");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person person: people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }

    private static void printAllPersons(List<Person> people) {
        for (Person person: people) {
            System.out.println(person);
        }
        System.out.println();
    }

    public interface Condition {
        boolean test(Person person);
    }
}


