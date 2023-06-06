package Lecture_20;
import java.util.*;
public class q5 {
    public static void qReversal(Queue<Integer>q){
        Stack<Integer> s = new Stack<Integer>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }       
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        qReversal(q);
    }
    
}
