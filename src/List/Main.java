package List;

import java.util.*;

public class Main {
    public static void main(String...args) {
        Stack stack  = new Stack(7);

        System.out.println("Pushing items");
        for (int i = 0;i < stack.getStck().length;i++){
            System.out.print(i + " ");
            stack.push(i);
        }

        System.out.println("\nStack contains: ");
        for (int i = 0 ;i < stack.getStck().length ;i++) System.out.print(stack.pop() + " ");

    }
}
