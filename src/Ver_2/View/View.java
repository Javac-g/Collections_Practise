package Ver_2.View;
import Ver_2.Data.Data;
//Class with user-interaction logic
import java.util.Scanner;
public class View {
    private final static Scanner scanner = new Scanner(System.in);
    public void printMenu(){
        System.out.println("Please select command:  ");
        System.out.println("1 - add new person");
        System.out.println("2 - find person");
        System.out.println("3 - update person");
        System.out.println("4 - delete person");
        System.out.println("5 - exit");
    }

    public Integer readCommand(){

        return scanner.nextInt();

    }


    public void printMessage(String message){
        System.out.println(message);
    }
    public String inputName(){
        System.out.println("Enter person name: ");
        String inpName = scanner.next();
        return inpName;
    }
    public String inputPosition(){
        System.out.println("Enter persons position: ");
        String inpPosition = scanner.next();
        return inpPosition;
    }
    public Integer inputID(){
        System.out.println("Enter persons ID: ");
        Integer inpID = scanner.nextInt();
        return inpID;
    }

    public void printPerson(Data data){
        System.out.println("Name: " + data.getName());
        System.out.println("Position: " + data.getPosition());
        System.out.println("ID: " + data.getId());
    }

}
