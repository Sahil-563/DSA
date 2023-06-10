package Lecture_24;
public class heap_sort {
    public static void heapify(int arr[],int i,int size){
        int left = (2*i)+1;
        int right = (2*i)+2;
        int maxIndx = i;
        if(left<arr.length && arr[maxIndx]<arr[left]){
            maxIndx = left;
        }
        if(right<arr.length && arr[maxIndx]<arr[right]){
            maxIndx = right;
        }
        while(maxIndx!=i){
            int temp = arr[maxIndx];
            arr[maxIndx] = arr[i];
            arr[i]=temp;
            heapify(arr, maxIndx, size);
        }
    }
    public static void heapSort(int arr[]){
        int n = arr.length;
        //Step1: Build MaxHeap
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        //Step2: push ist element to last
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0]=arr[i];
            arr[i] = temp;
            heapify(arr,0,i);
        }

    }
    public static void main(String args[]){
        int arr[]={1,5,4,2,3};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
