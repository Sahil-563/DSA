//Using kadane's algorithm:--
import java.util.*;
public class maximum_sum_subarrays3{
    public static void max_sum(int arr[]){
        int cs =0;
        int ms=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            cs +=arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.print(ms);
    }
    public static void main(String args[]) {
        int arr[] ={2,4,6,8,10};
        max_sum(arr);
    }
    
}