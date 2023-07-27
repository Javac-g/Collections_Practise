package Equals_hashCode;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Food {
    private String name;
    private Integer cost;

    public Food(String name,Integer cost){
        this.cost = cost;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }
    @Override
    public String toString(){
        return "\nName: " + name + "\nCoast: " + cost ;
    }
    @Override
    public boolean equals(Object ob){
        return EqualsBuilder.reflectionEquals(this,ob);
    }
    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
