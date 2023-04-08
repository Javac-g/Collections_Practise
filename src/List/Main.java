package List;

import java.util.*;

public class Main {
    public static void main(String...args) {
        List<String> name = new ArrayList<>();
        name.add("Maks");
        name.add("Anna");
        name.add("Irina");
        name.add("Alice");
        name.add("Dmitry");
        name.add("Lera");

        Iterator<String> iterator = name.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println("Name: " + s);
        }

    }
}
