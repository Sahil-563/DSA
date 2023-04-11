public class odd_even{
    public static void oddeven(int num){
        int bitmask=1;
        if((num&bitmask)==1){
            System.out.println(num+" is odd");
        }
        else{
            System.out.println(num+" is even");
        }
    }
    public static void main(String args[]){
        oddeven(2);
        oddeven(3);
    }
}