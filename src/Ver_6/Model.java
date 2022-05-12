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







}
