public class Quick_sort {
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pindx = partion(arr,si,ei);
        quickSort(arr, si, pindx-1);
        quickSort(arr,pindx+1,ei);
    }
    
    public static int partion(int arr[],int si,int ei){
        int pivot = arr[ei]; //Last indexed value is our pivot
        int i = si-1;
        for(int j = si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
    }
    i++;
    int temp = pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;


}
    public static void print_Arr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        print_Arr(arr);

    }
    
}
