import java.util.*;
public class Implementation {
    static class Stack(){
        static ArrayList<Integer> list = new ArrayList<>();
        
        //isEmpty()
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(top);
            return top;
        }
        public static int peek(){
            int top = list.get(list.size()-1);
            return top;
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        while(!s.isEmpty()){
            System.out.println(s.peek());
        }

    }
    
}

