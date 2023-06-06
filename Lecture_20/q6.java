package Lecture_20;
import java.util.*;
public class q6 {
    static class stack{
        static Deque<Integer> dq = new LinkedList<>();
        public static boolean isEmpty(){
            return dq.size() == 0;
        }
        public static void push(int data){
            dq.addFirst(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            return dq.removeFirst();
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return dq.getFirst();
        }
    }
    static class queue{
        static Deque<Integer> dq = new LinkedList<>();
        public static boolean isEmpty(){
            return dq.size() == 0;
        }
        public static void add(int data){
            dq.addLast(data);
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = dq.removeFirst();
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return dq.getFirst();
        }
    }
    public static void main(String[] args){
        stack s = new stack();
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        s.push(1);
        s.push(2);
        s.push(3);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
