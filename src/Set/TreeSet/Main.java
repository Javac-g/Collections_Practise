package Set.TreeSet;

import java.util.*;

public class Main {
    public static void demo_one(){
        Set<Lion> zoo = new TreeSet<>();
        Lion lion = new Lion("Mike",12);

        zoo.add(lion);
        Comparator<Person> personComparator =Comparator.comparing(Person::getName);
        Set<Person> school = new TreeSet<>(personComparator);
    }

    public static void demo_two(){
        List<String> names = Arrays.asList("Wayne","Anna","Bruce","Zoe","Chloe","Trisha","Clark");
        Set<String> tree = new TreeSet<>(names);
        System.out.println(tree);
        NavigableSet<String> nav = new TreeSet<>(tree);

    }
    public static void main(String...args){

        demo_two();

    }
}
