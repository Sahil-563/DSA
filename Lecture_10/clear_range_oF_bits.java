public class clear_range_oF_bits{
    public static int clearRangeofbits(int n,int i,int j){
        int a =((~0)<<(j+1));
        int b =((i<<i)-1);
        int bitmask = a|b;
        return n&bitmask;
    }
    public static void main(String args[]){
        System.out.print(clearRangeofbits(10,2,4));

    }
}