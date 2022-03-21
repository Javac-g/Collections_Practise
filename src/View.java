import java.util.Scanner;

public class View {

    private final static Scanner scanner = new Scanner(System.in);

    public void printMenuData(){
        System.out.println("Please select command:  ");
        System.out.println("1 - add new data");
        System.out.println("2 - find data");
        System.out.println("3 - update data");
        System.out.println("4 - delete data");
        System.out.println("5 - exit");
    }

    public Integer readCommand(){
        return scanner.nextInt();

    }

    public void printIncomingString(String incomingString){
        System.out.println(incomingString);
    }

    public String readStringData(){
        System.out.println("ENTER NAME: ");
        String incomingString = scanner.next();
        return incomingString;
    }
    public Integer readIntData(){
        System.out.println("ENTER ID");
        Integer incomingID = scanner.nextInt();
        return incomingID;
    }
    public void printData(Data data){
        System.out.println("NAME IS: " + data.getName() + "\nID IS: " + data.getId());
    }

}
