package Ver_4.Model;



import Ver_4.User.Data;

import java.util.ArrayList;
import java.util.List;

public class Model {
    Data data = new Data();
    private List<Data> database = new ArrayList<>();


    public void Create(String name,String position,Integer salary){
        data.setName(name);
        data.setPosition(position);
        data.setSalary(salary);
        database.add(data);
        System.out.println("Data add successful");
    }

    public Data Read(String name){

        for (Data search:database) {
            if(search.getName().equals(name)){

                return search;

            }


        }
        return null;

    }

    public Data Update(String name,String newName,String newPosition,Integer newSalary ){
        Data data = Read(name);
        if(data != null){
            data.setName(newName);
            data.setPosition(newPosition);
            data.setSalary(newSalary);
        }
        return null;
    }
    public Integer Delete(String deleteName){
        int indexToDelete = -1;
        for (int i = 0; i < database.size();i++){
            if(database.get(i).getName().equals(deleteName)){
                indexToDelete = i;
                break;
            }
        }
        if(indexToDelete != -1){
            database.remove(indexToDelete);
        }
        return indexToDelete;
    }


}
