package Ver_4.Controller;

import Ver_4.Model.Model;
import Ver_4.User.Data;
import Ver_4.View.View;

public class Controller {
    public void initController(){
        Model model = new Model();
        View view = new View();

        while (true){
            view.printMenu();
            int command = view.readCommand();

            switch (command){
                case 6:
                    break;
                case 5:
                case 4:
                    view.message("Enter pesrson to delete");
                    int index = model.Delete(view.addName());
                    if(index != -1){
                        System.out.println("Person № " + index + " deleted");
                    }else{
                        System.out.println("Nothing to delete");
                    }
                case 3:
                    view.message("Enter person to update - Name");
                    Data newData = model.Update(view.addName(),view.addName(),view.addPosition(),view.addSalary());
                    view.message("Result: ");
                    if(newData != null) {
                        view.printPersonData(newData);
                    }else{
                        view.message("Nothing to update");
                    }
                case 2:
                    view.message("Enter person to find-Name: ");
                    Data data = model.Read(view.addName());
                    if(data != null){
                        view.printPersonData(data);
                    }else {
                        view.message("Nothing to show");
                    }

                case 1:
                    view.message("Enter person Data");
                    model.Create(view.addName(),view.addPosition(),view.addSalary());
                    view.message("Data saved");
            }
        }
    }
}
