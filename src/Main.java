import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Юлия", "Парменова", 34));
        people.add(new Person("Ольга", "Шабунова", 40));
        people.add(new Person("Александр", "Головин", 40));
        people.add(new Person("Юлия", "Сапелкина", 42));
        people.add(new Person("Анна", "Снигирева", 51));
        people.add(new Person("Марина", "Беляева", 67));
        System.out.println(people);
        Collections.sort(people, new PersonsComparator(2));
        System.out.println(people);
    }
}