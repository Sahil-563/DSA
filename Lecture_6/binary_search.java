public class binary_search {
    public static int bin_search(int numbers[],int key){
        int start =0;
        int end = (numbers.length)-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid] ==key){
                return mid;
            }
            else if(numbers[mid]<key){
                start = mid+1; //Rigth part
            }
            else{
                end = mid -1;  //Left part
            }
        }
        return -1;
    }

    public static void main(String args[]){
        //Array must be sorted:--
        int numbers[]={2,4,6,8,10,12};
        int key = 4;
        System.out.print(bin_search(numbers, key));
    }
    
}
