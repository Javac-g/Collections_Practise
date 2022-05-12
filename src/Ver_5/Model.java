package Ver_5;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<Data> datalist = new ArrayList<>();

    public void create_person(String name,String position,Integer Salary){
        Data data = new Data();
        data.setName(name);
        data.setPosition(position);
        data.setSalary(Salary);
        datalist.add(data);

    }

    public Data find_person(String name){

        for(Data search: datalist){
            if(search.getName().equals(name)){
                return search;
            }
        }
        return null;
    }

    public Data update_person(String name,String newName,String newPosition,Integer newSalary){
        Data update = find_person(name);
        if (update != null){
            update.setName(newName);
            update.setPosition(newPosition);
            update.setSalary(newSalary);
            return update;
        }
        return null;
    }

    public int delete_person(String name){
        int index = -1;
        for(int i = 0 ; i < datalist.size();i++){
            if(datalist.get(i).getName().equals(name)){
                index = i;
                break;
            }
        }
        if(index != -1){
            datalist.remove(index);
        }
        return index;

    }

}
