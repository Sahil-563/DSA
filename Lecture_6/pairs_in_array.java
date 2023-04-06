public class pairs_in_array {

    //best possible solution:--
    public static void pairs_arr(int arr[]){
        int total_pairs=0;
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j =i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.print("Total number of pairs are: "+total_pairs);
        
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        /*int start =0;
        int end = arr.length-1;
        for(int i=start;i<=end;i++){
            for(int j = start+1;j<=end;j++){
                System.out.print(arr[i]+","+arr[j]+" ");
            }
            start +=1;
            System.out.println();*/
            pairs_arr(arr);


        }
    }
    

