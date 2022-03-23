package Ver_3.Controller;

import Ver_3.Data.Data;
import Ver_3.Model.Model;
import Ver_3.View.View;

import java.io.IOException;

public class Controller {
    public void initController() throws IOException {

        Model model = new Model();
        View view = new View();

        while (true){
            view.printMenu();
            Integer command = view.readCommand();

            if(command.equals(6)){
                break;
            }
            else if(command.equals(1)){
                view.printMessage("Enter persons data:");
                model.create(view.addName(),view.addPosition(),view.addId());
                view.printMessage("Data was added succsessfull! ");
            }
            else if(command.equals(2)){
                view.printMessage("Enter person name to find:");
                Data data = model.read(view.addName());

                if(data != null){
                    view.printData(data);
                }
                else {
                    view.printMessage("Nothing to show");
                }
            }
            else if(command.equals(3)){
                view.printMessage("Enter data to update: ");

                Data newData = model.update(view.addName(),view.addName(),view.addPosition(),view.addId());
                view.printMessage("Result of updating:");
                if(newData != null){
                    view.printData(newData);
                }else {
                    view.printMessage("Nothing to update");
                }
            }
            else if(command.equals(4)){
                view.printMessage("Enter person to delete: ");
                int index = model.delete(view.addName());

                if(index != -1){
                    view.printMessage("Person № " +index + " was deleted");
                }
                else {
                    view.printMessage("Nothing to delete");
                }
            }
            else if(command.equals(5)){
                view.printMessage("All DATABASE: \n");
                model.getAll();
            }
            else{
                view.printMessage("Wrong command");
            }








        }
    }
}
