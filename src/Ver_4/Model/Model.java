package Ver_4.Model;



import Ver_4.User.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
        String insertSQL = "INSERT INTO info VALUES(?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(insertSQL);
        byte[] b;
        String text;

        data.setName(person_name);
        data.setPosition(person_position);
        data.setSalary(person_salary);
        database.add(data);

        stmt.setInt(1,Statement.RETURN_GENERATED_KEYS);
        stmt.setString(2,person_name);
        stmt.setString(3,person_position);
        stmt.setInt(4,person_salary);
        stmt.executeUpdate();

        try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Max.000\\IdeaProjects\\Collections_Practice\\src\\Ver_4\\Model\\persons.txt",true)){

            text = "Name: " + data.getName() + " \n";
            b = text.getBytes();
            fileOutputStream.write(b);

            text = "Position: " + data.getPosition() + " \n";
            b = text.getBytes();
            fileOutputStream.write(b);

            text = "Salary: " + data.getSalary() + " \n";
            b = text.getBytes();
            fileOutputStream.write(b);

            text = "****************************\n";
            b = text.getBytes();
            fileOutputStream.write(b);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Data add successful");

    }

    public Data Read(String name) throws SQLException {
        Connection con = DriverManager.getConnection(url,user,password);
        String insertSQL = "SELECT * FROM info WHERE person_name = name)";

        Statement stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery(insertSQL);

        for (Data search : database) {

            if(search.getName().equals(name)){

                return search;

            }


        }
        return null;



    }

    public Data Update(String name, String newName, String newPosition, Integer newSalary ) throws SQLException {

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

        for (int i = 0; i < database.size(); i++){

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

    public void getAll() throws FileNotFoundException {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Max.000\\IdeaProjects\\Collections_Practice\\src\\Ver_4\\Model\\persons.txt")){

            int counter ;

            do{

                counter = fileInputStream.read();

                System.out.print((char)counter + " ");

            }while (counter!= -1);

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}
