package Set.TreeSet;

public class Lion implements Comparable<Lion>{
    private String name;
    private Integer id;

    public Lion(String name,Integer id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public Integer getId(){
        return id;
    }

    @Override
    public int compareTo(Lion ob){
        int comp = this.name.compareTo(ob.getName());
        if (comp == 0){
            comp = this.id.compareTo(ob.getId());
        }
        return comp;
    }
}
