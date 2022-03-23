package Ver_3.View;

import Ver_3.Data.Data;

import java.util.Scanner;

public class View {
    private final static Scanner scanner = new Scanner(System.in);
    public void printMenu(){
        System.out.println("Please select command:  ");
        System.out.println("1 - add new person");
        System.out.println("2 - find person");
        System.out.println("3 - update person");
        System.out.println("4 - delete person");
        System.out.println("5 - get all info");
        System.out.println("6 - exit");
    }
    public String addName(){
        System.out.println("Enter name: ");
        String Name = scanner.next();
        return Name;
    }
    public String addPosition(){
        System.out.println("Enter position");
        String Position = scanner.next();
        return Position;
    }

    public Integer addId(){
        System.out.println("Enter Id: ");
        Integer Id = scanner.nextInt();
        return Id;
    }
    public void printMessage(String message){
        System.out.println(message);
    }
    public Integer readCommand(){
        Integer command = scanner.nextInt();
        return command;
    }
    public void printData(Data data){

        System.out.println("Name: "+data.getName());
        System.out.println("Position: " + data.getPosition());
        System.out.println("Id " + data.getId());
    }
}