public class _a_rotated_Array {
    public static int search(int arr[],int si,int ei,int tar){
        int mid = si+ei/2;
        if(si>ei){
            return -1;
        }
        
        if(arr[mid] == tar){
            return mid;

        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<=arr[mid])
            {
                return search(arr, si, mid, tar);
            }
            else{
                return search(arr,mid+1,ei,tar);
            }

            
        }
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, mid+1, ei, tar);
            }
            else{
                return search(arr,mid-1,si,tar);
            }

        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int tar = 0;
        int ei = arr.length-1;
        int pindx = search(arr, 0,ei, tar);
        System.out.print(pindx);
    }
    
}
