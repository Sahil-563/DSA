public class p1 {
    public static void all_occurence(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if (arr[i]==key){
            System.out.println(i);
        }
        all_occurence(arr, key, i+1);

    }
    public static void main(String args[]){
        int arr[]= {2,3,4,2,3,4,5,4};
        int key = 2;
        int i = 0;
        all_occurence(arr, key, i);

    }
    
}
