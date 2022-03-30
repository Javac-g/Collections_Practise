package Ver_4.Model;



import Ver_4.User.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
        Statement stmt = con.createStatement();
        System.out.println(con);
        System.out.println(stmt);
        data.setName(person_name);
        data.setPosition(person_position);
        data.setSalary(person_salary);
        database.add(data);

        String insertSQL = "INSERT INTO info VALUES(?,?,?)";
        stmt.setString(1,person_name);
        System.out.println("Data add successful");
        stmt.executeUpdate(insertSQL);
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
