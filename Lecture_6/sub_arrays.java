public class sub_arrays {
    public static void print_sub_arr(int arr[]){
        for(int i =0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        print_sub_arr(arr);
    }
    
}
