public class sum_of_subarray {
    public static void print_sum_subarrays(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                sum =0;
                int end = j;
                for(int k = start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum +=arr[k];
                }
                System.out.println("Sum of subarray: "+sum);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        print_sum_subarrays(arr);

    }
    
}
