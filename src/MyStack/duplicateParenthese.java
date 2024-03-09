package Stack;

import java.util.Stack;

public class duplicateParenthese {
    public static boolean findDup(String str){
        Stack<Character> myStack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=')'){
                myStack.push(c);
            }
            else{
                int count=0;
                while(!myStack.isEmpty() && myStack.peek()!='('){
                    if(myStack.pop()!='('){
                        count++;
                    }
                }
                myStack.pop();

                if(count==0){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str="((a+b)+()+(c))";
        System.out.println(findDup(str));
    }
}
