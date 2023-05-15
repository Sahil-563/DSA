package Lecture_19;
import java.util.*;
public class q1 {
    public static void pushAtBottom(Stack<String> ss,String name){
        if(ss.isEmpty()){
            ss.push(name);
            return;
        }
        String top = ss.pop();
        pushAtBottom(ss, name);
        ss.push(top);
    }
    public static void main(String[] args){
        Stack<String> s = new Stack<>();
        s.push("Sahil");
        s.push("Visahl");
        s.push("Ishan");
        pushAtBottom(s,"Micky");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
    }
}
}