//optimized bubble sort:--
public class optimized_bubble_sort {
    public static void optimizedBubbleSort(int arr[]){
        for(int turn =0;turn<arr.length-1;turn++){
            boolean swap = false;
            for (int j =0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }

        }
    }

    public static void print_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        optimizedBubbleSort(arr);
        print_arr(arr);

    }
    
}
