package Ver_2.Model;

//Class with Business logic and DB.

import Ver_2.Data.Data;

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

    public Data update(String NameToUpdate,String newName,String newPosition,Integer newId){

        Data data = read(NameToUpdate);
        if(data != null){
            data.setName(newName);
            data.setPosition(newPosition);
            data.setId(newId);
        }
        return null;
    }


    public Integer delete(String NameToDelete){
        int indexToRemove = -1;

        for(int i = 0; i < datalist.size(); i++){
            if(datalist.get(i).getName().equals(NameToDelete)){
                indexToRemove = i;
                break;
            }

        }
        if(indexToRemove != -1){

            datalist.remove(indexToRemove);
        }

        return indexToRemove;
    }




}
