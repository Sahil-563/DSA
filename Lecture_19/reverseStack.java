package Lecture_19;
import java.util.*;
public class reverseStack {
    public static void pushAtBottom(Stack<Integer> ss,int data){
        if(ss.isEmpty()){
            ss.push(data);
            return;
        }
        int top = ss.pop();
        pushAtBottom(ss, data);
        ss.push(top);
    }
    public static void reverseSt(Stack<Integer> st){
        if(st.isEmpty())
        return;
        int top = st.pop();
        reverseSt(st);
        pushAtBottom(st,top);
    }
    public static void print(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
    }
}
    public static void main(String[] args){
        Stack <Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        reverseSt(st);
        print(st);
    }    
}
