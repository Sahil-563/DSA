package Lecture_20;
import java.util.*;
public class q4 {
    public static void interLeave(Queue<Integer> q1){
        Queue<Integer> q2 = new LinkedList<>();
        int size = q1.size()/2;
        for(int i =0;i<size;i++){
            q2.add(q1.remove());
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
        
    }
    public static void zigzag(Queue<Integer>q){
        int size = q.size()/2;
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3= new LinkedList<>();
        for(int i = 0; i < size; i++){
            q2.add(q.peek());
            q.remove();
        }
        while(!q.isEmpty()&&!q2.isEmpty()){
            q3.add(q2.peek());
            q3.add(q.peek());
            q2.remove();
            q.remove();
        }
        while(!q3.isEmpty()){
            System.out.print(q3.peek());
            q3.remove();
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        //zigzag(q);
        interLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.remove();
        }
    }
    
}
