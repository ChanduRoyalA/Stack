package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class reverseStringStack {
    public static void reverseString(String myStr){
        Stack<Character> myStack =  new Stack<>();
        for(int i=0;i<myStr.length();i++){
            myStack.push(myStr.charAt(i));
        }
        for(int i=0;i<myStr.length();i++){
            System.out.print(myStack.pop());
        }
    }

    public static void main(String[] args) {
        String myStr="chandu";
        reverseString(myStr);
    }
}
