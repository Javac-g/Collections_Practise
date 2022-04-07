package Ver_5;

import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    public String printMessage(String msg){
        return msg;
    }
    public Integer readCommand(){
        Integer command = scanner.nextInt();
        return command;
    }



    public void printMenu(){
        System.out.println("Choose menu option:  ");
        System.out.println("1 - Create person");
        System.out.println("2 - Find person");
        System.out.println("3 - Update person");
        System.out.println("4 - Delete person");
        System.out.println("5 - Exit");
    }
    public void printData(Data data){
        System.out.println("Name: " + data.getName());
        System.out.println("Position: " + data.getPosition());
        System.out.println("Salary: " + data.getSalary());
    }

    public String addName(){
        System.out.println("ENTER NAME: ");
        String name = scanner.next();
        return name;
    }
    public String addPosition(){
        System.out.println("ENTER Position: ");
        String Position = scanner.next();
        return Position;
    }
    public Integer addSalary(){
        System.out.println("ENTER Position: ");
        Integer Salary = scanner.nextInt();
        return Salary;
    }
}
