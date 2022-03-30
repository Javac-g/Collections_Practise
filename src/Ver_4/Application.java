package Ver_4;

import Ver_4.Controller.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {


    public static void main(String...args) throws SQLException {

        Controller controller = new Controller();
        controller.initController();
    }
}
