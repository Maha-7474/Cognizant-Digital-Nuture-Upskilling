import java.util.List;
import java.util.stream.Collectors;
record Person(String name, int age) {}
public class Records
{
    public static void main(String[] args)
    {
        List<Person> people = List.of(
            new Person("Alice", 20),
            new Person("Bob", 17),
            new Person("Charlie", 25),
            new Person("David", 16)
        );
        System.out.println("All Persons:");
        people.forEach(System.out::println);
        List<Person> adults = people.stream()
                                    .filter(person -> person.age() >= 18)
                                    .collect(Collectors.toList());
        System.out.println("\nPersons aged 18 and above:");
        adults.forEach(System.out::println);
    }
}