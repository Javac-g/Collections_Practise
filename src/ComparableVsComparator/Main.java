package ComparableVsComparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String...args){
        Animal first = new Animal("Lion",2,"common");
        Animal second = new Animal("Bengal Tiger",14,"rare");
        Animal third = new Animal("Lion",2,"rare");
        Animal fourth = new Animal("Lion",2,"common");
        Comparator<Animal> namesComp = new Comparator<Animal>(){
            @Override
            public int compare(Animal f,Animal s){
                return f.getName().compareTo(s.getName());
            }
        };
        Comparator<Animal> rareComp  = Comparator.comparing(Animal::getRare);
//        Comparator<Animal> rareComp  = (Animal a1,Animal a2)->{
//            return a1.getRare().compareTo(a2.getRare());
//        };
        Set<Animal> zoo = new TreeSet<>();
        zoo.add(first);
        zoo.add(second);
        zoo.add(third);
        zoo.add(fourth);
        System.out.println(zoo);
    }
}
