import java.util.Comparator;
public class PersonsComparator implements Comparator<Person> {
    protected int numberOfSurname;
    public PersonsComparator(int numberOfSurname) {
        this.numberOfSurname = numberOfSurname;
    }
    @Override
    public int compare(Person o1, Person o2) {
        String[] s;
        String[] s2;

        s = o1.getSurname().split("\\w");
        s2 = o2.getSurname().split("\\w");
        if (s.length >= numberOfSurname && s2.length >= numberOfSurname) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else if (s.length < s2.length) {
            return 1;
        } else if (s.length > s2.length) {
            return -1;
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}