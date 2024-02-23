package MyStack;

class MinStack {
    int maxSize=1000;
    int top;
    int[] arr=new int[maxSize];

    public MinStack() {
        top=-1;
    }

    public void push(int val) {
        if(top>=maxSize-1){
            System.out.println("OverFlow");
        }
        else{
            top++;
            arr[top]=val;
        }
    }

    public void pop() {
        if(top<0){
            System.out.println("UnderFlow");
        }
        else{
            top--;
        }

    }

    public int top() {
        return arr[top];
    }

    public int getMin() {
        int min=arr[0];
        for(int i=0;i<=top;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}