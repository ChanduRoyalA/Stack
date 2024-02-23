package MyStack;

public class Stack {
    static final int maxSize=100;
    int top;
    int[] arr=new int[maxSize];
    Stack(){
        top=-1;
    }
   boolean isEmpty(){
        return top<0;
   }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }
    void push(int x){
        if(top>=maxSize-1){
            System.out.println("Stack is Full");
        }
        else{
            top++;
            arr[top]=x;
        }
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        top--;
        return arr[top+1];
    }
    void print(){
        for(int i=top;i>-1;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
