package Stack;

import java.util.Arrays;
import java.util.Stack;

public class dailyTemp {
    public static  void dailyTemperature(int[] temp){
        Stack<Integer> myStack = new Stack<>();
        Stack<Integer> myDupStack = new Stack<>();
        int[] res=new int[temp.length];
        for(int i=temp.length-1;i>=0;i--){
            int count=1;
            while(!myStack.isEmpty() && temp[i]>myStack.peek()){
                myStack.pop();
                count++;
            }
            if(myStack.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]=count;
            }
            myDupStack.push(temp[i]);
            myStack.clear();
            myStack.addAll(myDupStack);
        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int[] temp={30,60,90};
        dailyTemperature(temp);
    }
}
