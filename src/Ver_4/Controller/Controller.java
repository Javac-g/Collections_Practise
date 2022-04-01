package Ver_4.Controller;

import Ver_4.Model.Model;
import Ver_4.User.Data;
import Ver_4.View.View;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Controller {
    public void initController() throws SQLException, FileNotFoundException {

        Model model = new Model();
        View view = new View();
        Integer command = 0;
        //unfinished
        //add break

        while (command !=5){
            view.printMenu();
            command = view.readCommand();

            switch (command){
                case 6:
                    view.message("List of all employee: ");
                    model.getAll();
                   return;
                case 5:
                    System.out.println("bye bye");
                case 4:
                    view.message("Enter pesrson to delete");
                    int index = model.Delete(view.addName());
                    if(index != -1){
                        System.out.println("Person № " + index + " deleted");
                    }else{
                        System.out.println("Nothing to delete");
                    }
                    break;
                case 3:
                    view.message("Enter person to update - Name");
                    Data newData = model.Update(view.addName(),view.addName(),view.addPosition(),view.addSalary());
                    view.message("Result: ");
                    if(newData != null) {
                        view.printPersonData(newData);
                    }else{
                        view.message("Nothing to update");
                    }
                    break;
                case 2:
                    view.message("Enter person to find-Name: ");
                    Data data = model.Read(view.addName());
                    if(data != null){
                        view.printPersonData(data);
                    }else {
                        view.message("Nothing to show");
                    }
                    break;
                case 1:
                    view.message("Enter person Data");
                    model.Create(view.addName(),view.addPosition(),view.addSalary());
                    view.message("Data saved");
                    break;
            }
        }
    }
}
