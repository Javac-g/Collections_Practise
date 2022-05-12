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
                view.printMessage("Saved!");
            } else if (command == 2) {
                view.printMessage("find person: ");
                Data find = model.find(view.addName());

                if(find != null){

                    view.readData(find);
                }else {
                    view.printMessage("Nothing to find");
                }


            } else if (command == 3) {
                view.printMessage("Epdate person");
                Data update = model.update(view.addName(), view.addName(), view.addSalary());

                if(update != null){
                    view.readData(update);
                }else {
                    view.printMessage("Nothing to update");
                }

            } else if (command == 4) {
                view.printMessage("Person to delete: ");
                int index = model.delete(view.addName());

                if(index != -1){
                    System.out.println("was delete person №: " + index);
                }else {
                    view.printMessage("Nothing to delete");
                }

            } else if (command == 5) {
                break;

            }else {
                System.out.println("wrong comand: ");
            }


        }




    }


}
