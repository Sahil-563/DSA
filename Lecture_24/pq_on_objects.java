package Lecture_24;
import java.util.*;
public class pq_on_objects {
    static class Student implements Comparable<Student> {
        String name;
        int rank;
        Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("a", 1));
        pq.add(new Student("b", 20));
        pq.add(new Student("c", 21));
        pq.add(new Student("d", 15));
        pq.add(new Student("e", 90));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"-->"+pq.peek().rank);
            pq.remove();
        }
    }
    
}
