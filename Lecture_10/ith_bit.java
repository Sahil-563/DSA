public class ith_bit{
    public static int get_Ith_bit(int num,int i){
        int bitmask =1<<i;
        if((num & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.print(get_Ith_bit(10, 1));

    }
}