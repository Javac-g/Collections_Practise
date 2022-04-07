package Ver_5;

import java.util.ArrayList;
import java.util.List;

public class Model {
    Data data = new Data();
    List<Data> datalist = new ArrayList<>();

    public void create_person(String name,String position,Integer Salary){

        data.setName(name);
        data.setPosition(position);
        data.setSalary(Salary);
        datalist.add(data);

    }

    public Data find person

}
