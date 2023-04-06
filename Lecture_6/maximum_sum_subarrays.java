import java.util.*;
public class maximum_sum_subarrays {
    public static void print_max_subarray_sum(int arr[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                curr_sum =0;
                int end = j;
                for(int k = start;k<=end;k++){
                    curr_sum +=arr[k];
                    if(max_sum<curr_sum){
                        max_sum=curr_sum;
                    }
                }
            }
        }
        System.out.print(max_sum);
    }

    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        print_max_subarray_sum(arr);

    }
    
}
