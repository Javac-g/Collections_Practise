package Ver_3.Model;

import Ver_3.Data.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Model {

    Data data = new Data();
    private List<Data> database = new ArrayList<>();

    public void create(String Name,String Position,Integer Id) throws IOException {
        data.setName(Name);
        data.setPosition(Position);
        data.setId(Id);
        database.add(data);
        try(FileInputStream fileInputStream = new FileInputStream(String.valueOf(data));
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Max.000\\IdeaProjects\\Collections_Practice\\src\\Ver_3\\Model\\data.txt",true)){
            String i;
            byte[] b;

            i = String.valueOf(data + " \n");
            b = i.getBytes();
            fileOutputStream.write(b);



        }catch (IOException e){
            System.out.println(e);
        }
    }

    public Data read(String Name){
        for(Data datasearch: database){
            if(datasearch.getName().equals(Name)){
                return datasearch;
            }
        }
        return null;
    }

    public Data update(String Name,String newName,String newPosition,Integer newId){
        Data data = read(Name);
        if(data != null){
            data.setName(newName);
            data.setPosition(newPosition);
            data.setId(newId);
        }
        return null;
    }
    public Integer delete(String name){
        int indexToRemove = -1;
        for(int c = 0 ; c < database.size();c++){
            if(database.get(c).getName().equals(name)){
                indexToRemove = c;
                break;
            }
        }
        if(indexToRemove != -1){
            database.remove(indexToRemove);
        }
        return indexToRemove;
    }

    public void getAll(){
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Max.000\\IdeaProjects\\Collections_Practice\\src\\Ver_3\\Model\\data.txt")){
            int i;
            do{
              i = fileInputStream.read();
              if(i != -1){
                  System.out.print((char)i+" ");
              }
            }while (i != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }







}
