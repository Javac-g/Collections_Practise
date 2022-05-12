package Ver_5;

public class Controller {
    public void init(){

        Model model = new Model();
        View view = new View();

        while (true){
            view.printMenu();
            Integer command = view.readCommand();

            if(command == 5){
                break;
            }
            else if(command == 1){
                view.printMessage("Create new person");

                model.create_person(view.addName(),view.addPosition(),view.addSalary());
                view.printMessage("Person created! ");
            }
            else if(command == 2){
                view.printMessage("Find person");
                Data data = model.find_person(view.addName());
                if(data != null){
                    view.printData(data);
                }else {
                    view.printMessage("Nothing to show");
                }


            }
            else if(command == 3){
                view.printMessage("Update person: ");
                Data newdata = model.update_person(view.addName(),view.addName(),view.addPosition(),view.addSalary());

                if(newdata != null){
                    view.printData(newdata);
                }
                else{
                    view.printMessage("Npthing to update");
                }
            }
            else if(command == 4){
                view.printMessage("Person to delete");
                int index = model.delete_person(view.addName());
                if(index != -1){
                    view.printMessage("person № " + index + " was deleted");
                }else {
                    view.printMessage("Nothing to delete");
                }
            }else{
                view.printMessage("Wrong command");
            }
        }





    }
}
