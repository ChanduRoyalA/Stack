package MyStack;
import java.util.Scanner;
import java.util.Stack;
public class vaildParanthesis {
    public static char getRightPar(char c){
        if(c==')'){
            return '(';
        }
        else if(c=='}'){
            return '{';
        }
        return '[';
    }
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        if(s.length()<=1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                myStack.push(c);
            }
            else{
                if(!myStack.isEmpty() && myStack.peek()==getRightPar(c)){
                    myStack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(!myStack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        System.out.println(isValid(s));;
    }
}
