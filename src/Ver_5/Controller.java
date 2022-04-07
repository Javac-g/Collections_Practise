package Ver_5;

public class Controller {
    public void initController(){

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

        }





    }
}
