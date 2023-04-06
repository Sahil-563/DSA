public class p2{
    public static int find_index(int arr[],int key){
        int start = 0;
        int end = (arr.length)-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int key = 7;
        System.out.print(find_index(arr, key));
    }
}