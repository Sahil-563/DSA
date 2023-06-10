package Lecture_24;
import java.util.*;
public class q4{
    static class pair implements Comparable<pair>{
        int val;
        int indx;
        public pair(int val, int indx){
            this.val = val;
            this.indx = indx;
        }
        @Override
        public int compareTo(pair p2){
            return p2.val - this.val; //This will sort the objects in descending order
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int k=3;
        int n = arr.length;
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int res[]= new int[n-k+1];
        for(int i=0;i<k;i++){
            pq.add(new pair(arr[i], i));
        }
        res[0]=pq.peek().val;
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().indx<=(i-k)){
                pq.remove();
            }
            pq.add(new pair(arr[i], i));
            res[i-k+1]=pq.peek().val;
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
        

    }
    
}