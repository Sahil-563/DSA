public class set_ith_bit{
    public static int setith_bit(int num,int i){
        int bit_mask =i<<1;
        return num|bit_mask;
    }
    public static void main(String args[]){
        System.out.print(setith_bit(10, 2));

    }
}