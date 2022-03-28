package Ver_4.View;

import Ver_4.User.Data;

import java.util.Scanner;

public class View {

    private final static Scanner scanner = new Scanner(System.in);

    public void printMenu(){
        System.out.println("Please select command:  ");
        System.out.println("1 - add new person");
        System.out.println("2 - find person");
        System.out.println("3 - update person data");
        System.out.println("4 - delete person");
        System.out.println("5 - ?????????????");
        System.out.println("6 - exit");
    }
    public String message(String message){

        return message;

    }
    public Integer readCommand(){
        Integer command = scanner.nextInt();
        return command;
    }
    public String addName(){
        System.out.println("Enter Name: ");
        String name = scanner.next();
        return name;
    }
    public String addPosition(){
        System.out.println("Enter position: ");
        String position = scanner.next();
        return position;
    }
    public Integer addSalary(){
        System.out.println("Enter salary: ");
        Integer salary = scanner.nextInt();
        return salary;
    }
    public void printPersonData(Data data){
        System.out.println("Name: " + data.getName());
        System.out.println("Position: " + data.getPosition());
        System.out.println("Salary: " + data.getSalary());
    }
}
