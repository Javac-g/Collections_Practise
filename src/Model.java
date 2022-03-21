import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<Data> datalist  = new ArrayList<>();

    public void create(String incomingName,Integer incomingID){

        Data data = new Data();
        data.setName(incomingName);
        data.setId(incomingID);
        datalist.add(data);

    }

    public Data find(String searchString){
        for(Data searchData : datalist){

            if(searchData.getName().equals(searchString)  ){
                return searchData;
            }
        }
        return null;
    }

    public Data update(String oldString,String  newName, Integer newID){
            Data data = find(oldString);
            if(data != null){
                data.setName(newName);
                data.setId(newID);
                return data;
            }

        return null;
    }

    public int delete(String stringDataToRemove){
        int indexToRemove = -1;
        for(int i = 0; i < datalist.size(); i++){
            if(datalist.get(i).getName().equals(stringDataToRemove)){
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
