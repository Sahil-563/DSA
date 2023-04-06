public class p1 {
    public static boolean duplicate(int arr[]){
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j =(i+1);j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag = true;
                }
            }
        }
        return flag;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        if(duplicate(arr)){
                System.out.print("True");
            }
            else{
                System.out.print("False");
            }
        }
}
    
