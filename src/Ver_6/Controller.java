package Ver_6;

public class Controller {

    View view = new View();
    Model model = new Model();

    public void init(){

        while (true){

            view.printMenu();
            Integer command = view.readCommand();

            if(command == 1){
                view.printMessage("Enter person to add: ");
                model.create(view.addName(),view.addSalary());
            }





        }




    }


}
