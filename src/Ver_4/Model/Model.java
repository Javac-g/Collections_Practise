package Ver_4.Model;



import Ver_4.User.Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Model {
    Data data = new Data();
    private List<Data> database = new ArrayList<>();
    private static final String url = "jdbc:postgresql://localhost:5433/personal";
    private static final String user = "postgres";
    private static final String password = "postgres";



    public void Create(String person_name,String person_position,Integer person_salary) throws SQLException {
        Connection con = DriverManager.getConnection(url,user,password);


        data.setName(person_name);
        data.setPosition(person_position);
        data.setSalary(person_salary);
        database.add(data);
        Integer I =1;
        String insertSQL = "INSERT INTO info VALUES(?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(insertSQL);
        stmt.setInt(1,I++);
        stmt.setString(2,person_name);
        stmt.setString(3,person_position);
        stmt.setInt(4,person_salary);
        I++;
        System.out.println("Data add successful");
        stmt.executeUpdate();
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
