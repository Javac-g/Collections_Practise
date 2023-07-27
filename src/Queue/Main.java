package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String...args){
        ArrayDeque<Integer> nums = new ArrayDeque<>();
        for (int i = 10; i< 100; i+=5){
            if (i % 2 != 0){
                nums.push(i);
                continue;
            }
            nums.add(i);
        }
        System.out.println(nums);
        System.out.println("Peek: " + nums.peek());
        System.out.println(nums);
        System.out.println("Poll: " + nums.poll());
        System.out.println(nums);
        System.out.println("Remove: " + nums.remove());
        System.out.println(nums);
        System.out.println("Pop: " + nums.pop());
        System.out.println(nums);

    }
}
