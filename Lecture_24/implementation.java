package Lecture_24;
import java.util.*;
public class implementation {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(-1);
        pq.add(-2);
        pq.add(-3);
        pq1.add(10);
        pq1.add(-1);
        pq1.add(-2);
        pq1.add(-3);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
        System.out.println("The reversed order of this queue is");
        //For prnting in reverse order
        while(!pq1.isEmpty()){
            System.out.print(pq1.peek()+" ");
            pq1.remove();
        }
    }
    
}
