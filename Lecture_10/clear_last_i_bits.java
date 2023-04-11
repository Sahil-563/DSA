public class clear_last_i_bit{
    public static int clear_Last_i_bits(int n,int i){
        int bitmask = ~0<<i;
        return n&bitmask;
    }
    public static void main(String args[]){
        System.out.println(clear_Last_i_bits(10, 2));

    }
}