package ComparableVsComparator;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
    private String name;
    private Integer age;
    private String rare;

    public Animal(String name,Integer age, String rare){
        this.name = name;
        this.age = age;
        this.rare = rare;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getRare() {
        return rare;
    }
    @Override
    public int compareTo(Animal animal){
        int comp = getName().compareTo(animal.getName());
        if (comp == 0){
            comp = getAge().compareTo(animal.getAge());
            if (comp == 0){
                comp = getRare().compareTo(animal.getRare());
            }
        }
        return comp;
    }
    @Override
    public boolean equals(Object ob){
        if (this == ob){
            return true;
        }
        if (ob== null || getClass() != ob.getClass()){
            return false;
        }
        Animal animal = (Animal)ob;
        return Objects.equals(getName(),animal.getName()) && Objects.equals(getAge(),animal.getAge()) && Objects.equals(getRare(),animal.getRare());
    }
    @Override
    public int hashCode(){
        int hash = 11;
        hash = hash * 3 + Objects.hashCode(name);
        hash = hash * 3 + Objects.hashCode(age);
        hash = hash * 3 + Objects.hashCode(rare);
        return hash;
    }
    @Override
    public String toString(){
        return "\nName: " + getName() + "\nAge: " + getAge() + "\nRare: " + getRare();
    }
    //another possible
//    @Override
//    public int hashCode(){
//        return Objects.hash(name,age,rare);
//    }
}
