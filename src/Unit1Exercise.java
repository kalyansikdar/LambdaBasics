import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {
    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        Collections.sort(people);
        printAllPersons(people);
    }
    private static void printAllPersons(List<Person> people) {
        for (Person person: people) {
            System.out.println(person);
        }
    }

    // Ex 1: Print all the persons
    // Ex 2: Print all persons whose names start with C
    // Ex 3: Print all persons whose names ends with E
}
