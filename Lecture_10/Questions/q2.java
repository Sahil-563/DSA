public class q2{
    public static boolean is_power_of_two(int n){
        if((n&(n-1))==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        System.out.println(is_power_of_two(12));

    }
}