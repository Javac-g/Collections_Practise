package Set.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String...args){
        Set<Lion> zoo = new TreeSet<>();
        Lion lion = new Lion("Mike",12);

        zoo.add(lion);
        Comparator<Person> personComparator =Comparator.comparing(Person::getName);
        Set<Person> school = new TreeSet<>(personComparator);


    }
}
