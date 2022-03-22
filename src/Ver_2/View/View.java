package Ver_2.View;
import Ver_2.Data.Data;

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

    public String printMessage(String message){
        return message;
    }
    public String inputName(){
        String inputName = scanner.next();
        return inputName;
    }
    public String inputPosition(){
        String inputPosition = scanner.next();
        return inputPosition;
    }
    public Integer inputID(){
        Integer inputID = scanner.nextInt();
        return inputID;
    }

    public void printPerson(Data data){
        System.out.println("Name: " + data.getName());
        System.out.println("Position: " + data.getPosition());
        System.out.println("ID: " + data.getId());
    }

}
