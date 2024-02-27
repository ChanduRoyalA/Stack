package Stack;

import java.util.ArrayList;
import java.util.List;

public class generateParentheses {
    public static void backt(int open,int close,String str,int n,List<String> myList){
        if(str.length()==n*2){
            myList.add(str);
            return;
        }
        if(open<n){
            backt(open+1,close,str+"(",n,myList);

        }
        if(close<open){
            backt(open,close+1,str+")",n,myList);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> myList=new ArrayList<>();
        backt(0,0,"",n,myList);
        return(myList);
    }
    public static void main(String[] args) {
        generateParenthesis(3);
    }
}
