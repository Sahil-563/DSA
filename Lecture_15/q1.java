public class q1 {
    public static void change_arr(int arr[],int i,int val){
        if(i == arr.length){
            print_arr(arr);
            System.out.println();
            return;
        }
        arr[i]=val;
        change_arr(arr, i+1, val+1);
        arr[i]=arr[i]-2;   //Backtraking 
    }
    public static void print_arr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String args[]){
        int arr[]= new int[5];
        change_arr(arr, 0, 1);
        print_arr(arr);
    }
    
}
