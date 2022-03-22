package Ver_2.Control;
//Class of full app, combine Model and View into one Method.

import Ver_2.Data.Data;
import Ver_2.Model.Model;
import Ver_2.View.View;

public class Controller {

    public void initController(){
        Model model = new Model();
        View view = new View();

        while (true){
            view.printMenu();
            Integer command = view.readCommand();

            if(command.equals(5)){
                break;
            }
            else if (command.equals(1)){
                view.printMessage("Enter persons data:");
                model.create(view.inputName(),view.inputPosition(),view.inputID());
                view.printMessage("Data was added succsessfull! ");
            }
            else if(command.equals(2)){
                view.printMessage("Enter person name to find:");
                Data data = model.read(view.inputName());

                if(data != null){
                        view.printPerson(data);
                }
                else {
                        view.printMessage("Nothing to show");
                }
            }
            else if(command.equals(3)){
                view.printMessage("Enter data to update: ");

                Data newData = model.update(view.inputName(),view.inputName(),view.inputPosition(),view.inputID());
                view.printMessage("Result of updating:");
                if(newData != null){
                    view.printPerson(newData);
                }else {
                    view.printMessage("Nothing to update");
                }
            }
            else if(command.equals(4)){
                view.printMessage("Enter person to delete: ");
                int index = model.delete(view.inputName());

                if(index != -1){
                    view.printMessage("Person №" +index + " was deleted");
                }
                else {
                    view.printMessage("Nothing to delete");
                }
            }
            else{
                view.printMessage("Wrong command");
            }

        }

    }

}
