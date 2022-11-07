import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;

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

        people.sort((o1,o2)->{
            String[] s;
            String[] s2;
            int numberOfSurname=2;
            s = o1.getSurname().split("\\w");
            s2 = o2.getSurname().split("\\w");
            if (s.length >= numberOfSurname && s2.length >= numberOfSurname) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            if (s.length < s2.length) {
                return 1;
            } else if (s.length > s2.length) {
                return -1;
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        });

        Predicate<Person> isLess18 = person -> person.getAge() < 18;
        people.removeIf(isLess18);
        System.out.println(people);
    }
}