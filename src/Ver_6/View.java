package Ver_6;

import java.util.Scanner;

public class View {


    private  static final Scanner scanner = new Scanner(System.in);

    public void printMessage(String msg){
        System.out.println(msg);
    }

    public void printMenu(){

        System.out.println("Choose menu:");
        System.out.println("1 - add user");
        System.out.println("2 - find user");
        System.out.println("3 - update user");
        System.out.println("4 - delete user");
        System.out.println("5 - exit");

    }
    Integer readCommand(){

        return scanner.nextInt();

    }

    public void readData(Data data){

        System.out.println("Name: " + data.getName());
        System.out.println("Salary: " + data.getSalary());

    }
    String addName(){
        System.out.println("Enter name: ");
        return scanner.next();

    }
    Integer addSalary(){
        System.out.println( "Enter salary: ");
        return scanner.nextInt();

    }


}
