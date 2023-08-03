import java.util.*;

public class ReverseStack {

    
    public static void reverseStack(Stack<Integer> int  data) {
        while (!s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s,top);
    }
    public static void printSTACK(Stack<Integer> s ){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }


    
    
     public static void  main(String args)[] {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printSTACK(s);
        reverseSTACK(s);
        printSTACK(s);

    }
    private static void reverseSTACK(Stack<Integer> s) {
    }

}
