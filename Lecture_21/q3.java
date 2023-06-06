package Lecture_21;
import java.util.*;
public class q3 {
    public static void main(String args[]){
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};
        Arrays.sort(A);
        Arrays.sort(B);
        int minVal =0;
        for(int i=0;i<A.length;i++){
            int diff= Math.abs(A[i]-B[i]);
            minVal+=diff;
        }
        System.out.println(minVal);
   }
    
}
