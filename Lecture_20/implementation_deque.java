package Lecture_20;
import java.util.*;
public class implementation_deque {
    public static void main(String[] args){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);

    }
    
}
