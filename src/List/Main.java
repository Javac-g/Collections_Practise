package List;

import java.util.*;

public class Main {
    public static void main(String...args) {
        List<String> names = new ArrayList<>();
        names.add("Maks");
        names.add("Anna");
        names.add("Irina");
        names.add("Alice");
        names.add("Dmitry");
        names.add("Lera");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        Iterator<String> iterator1 = names.iterator();
        Iterable<String> s3 = new ArrayList<>();
        Collection<String> s4 = new ArrayList<>();
    }
}
