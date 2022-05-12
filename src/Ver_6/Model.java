package Ver_6;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<Data> dataList = new ArrayList<>();

    public void create(String name, Integer salary){

        Data person = new Data();

        person.setName(name);

        person.setSalary(salary);

        dataList.add(person);

    }

    public Data find(String name){

        for(Data searchPerson: dataList){

            if (searchPerson.getName().equals(name)){

                return searchPerson;

            }

        }
        return null;


    }
    public Data update(String name, String newName, Integer newSalary){

        Data upPerson = find(name);

        if(upPerson != null){
            upPerson.setName(newName);
            upPerson.setSalary(newSalary);
            return upPerson;
        }
        return null;

    }
    public Integer delete(String name){

        int indextoremove = -1;

        for (int i = 0 ; i < dataList.size(); i++){

            if(dataList.get(i).getName().equals(name)){

                indextoremove = i;

            }
        }
        if(indextoremove != -1){

            dataList.remove(indextoremove);

        }

        return indextoremove;

    }







}
