package Lecture_19;

public class array {
    static int sz =1000;
    static int arr[]= new int[sz];
    static int top =-1;

    public static class stackB{
        public static boolean isEmpty(){
            return top == -1;
        }
        public static void push(int data){
            top++;
            arr[top] = data;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int x = arr[top];
            top--;
            return x;

        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[top];
        }
        public static int size(){
            return top+1;
        }
    }
    public static void main(String args[]){
        stackB sb = new stackB();
        sb.push(1);
        sb.push(2);
        while(!sb.isEmpty()){
            System.out.println(sb.peek());
            sb.pop();
        }
    }
    
}
