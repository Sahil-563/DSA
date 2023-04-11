import java.util.concurrent.CountDownLatch;

public class q3{
    public static int Count_set_bits(int n){
        int count =0;
        int bitmask =1;
        while(n>0){
            if((n & bitmask)==1){
                count ++;
            }
            n=n>>1;
        }
        return count;

    }
    public static void main(String args[]){
        System.out.println(Count_set_bits(10));

    }
}