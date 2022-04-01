package Ver_4;

import Ver_4.Controller.Controller;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {


    public static void main(String...args) throws SQLException, FileNotFoundException {

        Controller controller = new Controller();
        controller.initController();
    }
}
