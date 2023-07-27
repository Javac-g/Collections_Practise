package Set.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String...args) {

        Set<Integer> set = new HashSet<>();
        set.add(70);
        set.add(88);
        set.add(2);
        set.add(42);
        set.add(3);
        System.out.println(set);
        Set<Integer> tree = new TreeSet<>(set);//or use tree.addAll(set);
        System.out.println(tree);
    }
}
