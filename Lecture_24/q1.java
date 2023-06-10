package Lecture_24;
import java.util.*;
public class q1{
    static class pt implements Comparable<pt> { 
        int distsq;
        int indx;
        public pt(int distsq,int indx) { 
            this.distsq = distsq;
            this.indx = indx;
        }
        @Override
        public int compareTo(pt p2){
           return this.distsq-p2.distsq;
        }
    }
    public static void main(String[] args){
        PriorityQueue<pt> pq = new PriorityQueue<>();
        int ar[][] ={{3,3},{5,-1},{-2,4}};
        int k =2;
        for(int i=0;i<ar.length;i++){
            int distsq = ar[i][0]*ar[i][0]+ar[i][1]*ar[i][1];
            pq.add(new pt(distsq,i));
        }
        while(k>0){
            System.out.println("C"+pq.peek().indx+"  Distance:"+pq.peek().distsq);
            pq.remove();
            k--;
        }
        
    }
}