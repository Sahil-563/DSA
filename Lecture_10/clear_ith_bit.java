public class clear_ith_bit{
    public static int clearith_bit(int num , int i){
        int bit_mask=~(1<<i);
        return num&bit_mask;

    }
    public static void main(String args[]){
        System.out.println(clearith_bit(10, 1));
        
    }
}