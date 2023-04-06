public class reverse_array {
    public static void rev_no(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp =0;
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start+=1;
            end-=1;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        rev_no(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        
    }
    
}
