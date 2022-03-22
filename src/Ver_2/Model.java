package Ver_2;

//Class with Business logic and DB.

import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<Data> datalist = new ArrayList<>();

    public void create(String Name , String Position,Integer Id){

        Data data = new Data();
        data.setName(Name);
        data.setPosition(Position);
        data.setId(Id);

    }

    public Data read(String Name){
        for (Data search: datalist) {
            if(search.getName().equals(Name)){
                return search;
            }

        }
        return null;
    }
}
