package Lecture_19;
import java.util.*;
public class n {
    static Stack<Integer> st = new Stack<Integer>();
    public static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        st.push(s.peek());
        s.pop();
        reverse(s);
    }
    public static void print(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
            
    }
}
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        print(s);
        reverse(s);
        print(s);
    }
    
}
