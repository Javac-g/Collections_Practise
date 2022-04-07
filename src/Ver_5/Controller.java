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
            else if(command == 2){
                view.printMessage("Find person");
                Data searchdata = model.find_person(view.addName());
                if(searchdata != null){
                    view.printData(searchdata);
                }else {
                    view.printMessage("Npthing to show");
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
        }





    }
}
