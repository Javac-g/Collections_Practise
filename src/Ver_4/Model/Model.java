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


}
