package Stack;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterEle {
    public static void nextGreater(int[] nums){
        Stack<Integer> myStack = new Stack<>();
        int[] nextGreat=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
                while(!myStack.isEmpty() && myStack.peek()<=nums[i]){
                    myStack.pop();
                }
                if(myStack.isEmpty()){
                    nextGreat[i]=-1;
                }
                else{
                    nextGreat[i]=myStack.peek();
                }
                myStack.push(nums[i]);
            }

        System.out.println(Arrays.toString(nextGreat));
    }

    public static void main(String[] args) {
        int[] nums={6,8,0,1,3};
        nextGreater(nums);
    }
}
