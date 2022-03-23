package Ver_2;

import Ver_2.Control.Controller;

import java.io.IOException;

//Point of starting application.
public class Application {
    public static void main(String...args) throws IOException {

        Controller controller = new Controller();
        controller.initController();
    }
}
