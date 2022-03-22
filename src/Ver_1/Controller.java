package Ver_1;

public class Controller {

    public void initController(){
        View view = new View();
        Model model = new Model();

        while(true){
            view.printMenuData();
            Integer command = view.readCommand();
            if(command.equals(5)){
                break;
            }
            else if(command.equals(1)){
                view.printIncomingString("Enter data to add");
                model.create(view.readStringData(),view.readIntData());
                view.printIncomingString("data was added");
            }
            else if(command.equals(2)){
                view.printIncomingString("Enter data to find");
                Data data = model.find(view.readStringData());

                if(data != null){
                    view.printData(data);
                }else {
                    view.printIncomingString("Noting to show");
                }

            }
            else if(command.equals(3)){
                view.printIncomingString("Enter data to update: ");
                view.printIncomingString("Enter old name: ");
                Data newData = model.update(view.readStringData(),view.readStringData(),view.readIntData());
                view.printIncomingString("Result of updating: ");
                if(newData != null){
                    view.printData(newData);
                }else{
                    view.printIncomingString("Nothing to update");
                }
            }
            else if(command.equals(4)){
                view.printIncomingString("Enter data to delete");
                int index = model.delete(view.readStringData());
                if(index != -1){
                    view.printIncomingString("Data in index: " + index + " was deleted");
                }else {
                    view.printIncomingString("Nothing to delete");
                }
            }else{
                view.printIncomingString("wrong command");
            }
        }
    }
}
