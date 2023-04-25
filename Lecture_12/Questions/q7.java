public class q7 {
    public static int firstOccurence(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,9,5,3};
        int key = 11;
        int i =0;
        System.out.print(firstOccurence(arr, key, i));

    }
    
}
