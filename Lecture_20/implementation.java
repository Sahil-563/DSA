package Lecture_20;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class implementation {
    static class Queue{
        static int arr[];
        static int rear;
        static int front;
        static int size;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
            
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(10);
        q.add(1);
        q.add(2);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
