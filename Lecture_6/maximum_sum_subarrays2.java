import java.util.*;
public class maximum_sum_subarrays2 {
    public static void max_subarray(int arr[]){
        int curr_sum =0;
        int max_sum = Integer.MIN_VALUE;
        int prefix_arr[]=new int[arr.length];
        prefix_arr[0]=arr[0];
        for(int i =1;i<prefix_arr.length;i++){
            prefix_arr[i]=prefix_arr[(i-1)]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start = i;
            for (int j=i;j<arr.length;j++){
                int end = j;
                curr_sum = start ==0?prefix_arr[end]:prefix_arr[end]-prefix_arr[start-1];
                if(max_sum<curr_sum){
                    max_sum = curr_sum;
                }
            }
        }
        System.out.print(max_sum);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        max_subarray(arr);
    }
    
}
