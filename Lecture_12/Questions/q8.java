public class q8 {
    public static int lastOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isfound=lastOccurence(arr, key, i+1);
        if(isfound == -1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,9,5,3};
        int key = 5;
        int i =0;
        System.out.print(lastOccurence(arr, key, i));

    }
    
}
