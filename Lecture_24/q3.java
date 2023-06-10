package Lecture_24;
import java.util.*;
public class q3 {
    static class row implements Comparable<row> {
        int indx;
        int soldiers;
        public row(int indx,int soldiers){
            this.indx = indx;
            this.soldiers =soldiers;
        }
        @Override
        public int compareTo(row r2){
            if(this.soldiers==r2.soldiers){
                return this.indx-r2.indx;
            }
            else{
                return this.soldiers-r2.soldiers;
            }
        }
    }
    public static void main(String[] args){
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};
        int k=3;
        PriorityQueue<row>pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count =0;
            for(int j=0;j<army[i].length;j++){
                if(army[i][j]==1){
                    count+=1;
                }
            }
            pq.add(new row(i,count));
        }
        while(k>0){
            System.out.println("Row: "+pq.peek().indx);
            pq.remove();
            k--;
        }
    }
}
