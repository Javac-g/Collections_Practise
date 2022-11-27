package Collections;

public class Stack {
    private int last,size;
    private int[] stck;

    public Stack(int size) {
        stck = new int[size];
        last = -1;
    }
    public void push(int item){
        if (last > size){
            int[] temp = new int[stck.length*2];
            for (int i = 0;i <= stck.length-1;i++){
                temp[i] = stck[i];
            }
            stck = temp;
        }
        stck[++last] = item;
    }
    public int pop(){
        if(last < 0){
            System.out.println("Stack is empty");
        }
        return stck[last--];
    }
}
