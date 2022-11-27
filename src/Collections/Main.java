package Collections;

public class Main {
    public static void main(String...args){

        Stack stack = new Stack(15);
        for (int i = 0;i <= 17;i++)stack.push(i*5);
        System.out.println("Stack Have");
        for (int i = 0 ;i<=17;i++){
            System.out.print(stack.pop() + " ");
        }

    }
}
