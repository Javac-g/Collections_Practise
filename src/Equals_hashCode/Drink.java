package Equals_hashCode;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Drink {
    private String name;
    private int cost;

    public Drink(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object ob){
       Drink drink = (Drink)ob;
       return new EqualsBuilder().appendSuper(super.equals(ob))
               .append(name,drink.getName())
               .append(cost,drink.getCost())
               .isEquals();
    }
    @Override
    public int hashCode(){
        return new HashCodeBuilder()
                .append(name)
                .append(cost)
                .toHashCode();
    }

    public int getCost() {
        return cost;
    }
}
