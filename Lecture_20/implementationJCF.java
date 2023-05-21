package Lecture_20;
import java.util.*;
public class implementationJCF {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
