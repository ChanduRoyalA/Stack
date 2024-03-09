package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

    public static void Span(int[] arr) {
        Stack<Integer> myStack = new Stack<>();
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i==0){
                res[i]=1;
                myStack.push(i);
                continue;
            }
            while(!myStack.isEmpty() && arr[myStack.peek()]<arr[i] ){
                myStack.pop();
            }
            if(myStack.isEmpty()){
                res[i]=i+1;
            }
            else{
                res[i]=i-myStack.peek();
            }
            myStack.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {

        int[] arr={80,80,60,70,60,85,100};

        Span(arr);
    }
}
