package Lecture_21;
import java.util.*;
public class q7 {
    public static void main(String args[]){
        Integer Costhor[]={2,1,3,1,4};
        Integer Costver[]={4,1,2};
        Arrays.sort(Costver,Collections.reverseOrder());
        Arrays.sort(Costhor,Collections.reverseOrder());
        int hp=1;
        int vp = 1;
        int h=0;
        int v=0;
        int cost =0;
        while(h<Costhor.length && v<Costver.length){
            if(Costver[v]<=Costhor[h]){
                cost += (Costhor[h]*vp);
                hp++;
                h++;
            }
            else{
                cost += (Costver[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<Costhor.length){
                cost += (Costhor[h]*vp);
                hp++;
                h++;
        
        }
        while(v<Costver.length){
            cost += (Costver[v]*hp);
            vp++;
            v++;
    }
    System.out.println(cost);
    
}
}
