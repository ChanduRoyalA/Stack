package MyStack;

import java.util.ArrayList;
import java.util.Stack;

public class infixToPostFix {
    static int pre(char c){
        if(c=='^'){
            return 3;
        }
        else if(c=='/' || c=='*'){
            return 2;
        }
        else if(c=='+' || c=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }
    static void  infixPostfix(String myStr){
        Stack<Character> myStack = new Stack<>();
        ArrayList<Character> myList = new ArrayList<>();
        for(int i=0;i<myStr.length();i++){
            char c=myStr.charAt(i);
            if(Character.isAlphabetic(c)){
                myList.add(c);
            }
            else{
                if(myStack.isEmpty()){
                    myStack.push(c);
                }
                if(c==')'){
                    while(!myStack.isEmpty() && myStack.peek()!='('){
                        myList.add(myStack.pop());
                    }
                }
                if(pre(c)>pre(myStack.peek())){
                    myStack.push(c);
                }
                else{
                    myList.add(myStack.pop());
                    myStack.push(c);
                }
            }
        }
        while(!myStack.isEmpty()){
            myList.add(myStack.pop());
        }
        for(int i=0;i<myList.size();i++){
            System.out.print(myList.get(i));
        }

    }

    public static void main(String[] args) {
        String myStr="A+B*C+D";
        infixPostfix(myStr);
    }
}
