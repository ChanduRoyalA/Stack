package Stack;
//Evaluate Reverse Polish Notation (Stack)

import java.util.Scanner;
import java.util.Stack;

public class reversePolishNotation {
    public static   int getRes(int a,int b,String s){
        int res=0;
        switch (s){
            case "+":
                res= a+b;
                break;
            case "-":
                res= b-a;
                break;
            case "/":
                res= b/a;
                break;
            case "*":
                res= a*b;
                break;

        }
        return res;
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> myStack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("*") || tokens[i].equals("-") || tokens[i].equals("/")){
                int a=myStack.pop();
                int b=myStack.pop();
                int res=getRes(a,b,tokens[i]);
                myStack.push(res);
            }
            else{
                myStack.push(Integer.parseInt(tokens[i]));
            }
        }
        int finalRes=myStack.pop();
        return (finalRes);
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of the tokens");
        int n=in.nextInt();
        String[] tokens=new String[n];
        System.out.println("Provide the tokens");
        for(int i=0;i<n;i++){

            tokens[i]=in.next();
        }
        System.out.println("Value of the provided token: "+evalRPN(tokens));
    }

}
