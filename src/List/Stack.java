package List;

public class Stack {
    private int[] stck;
    private int N;
    private int count;

    public int[] getStck() {
        return stck;
    }

    public Stack(int size){
        stck = new int[size];
        N = -1;
        count = 0;
    }
    public void push(int item){
        if (N == stck.length-1){

            int[] temp = new int[stck.length * 2 ];
            System.arraycopy(stck,0,temp,0,stck.length);
            temp[++N] = item;
            stck = temp;


        }else {
            stck[++N] = item;
        }
    }

    public int pop(){
        if (N  < 0){
            System.out.println("Stack is empty");
        }

        if (count <= N) {
            return stck[count++];//Use stck[N--] for reverse order.
        }
        return 0;
    }
}
