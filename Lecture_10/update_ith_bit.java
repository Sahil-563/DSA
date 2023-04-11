public class update_ith_bit{
    public static int clearith_bit(int num , int i){
        int bit_mask=~(1<<i);
        return num&bit_mask;
    }
    public static int setith_bit(int num,int i){
        int bit_mask =i<<1;
        return num|bit_mask;
    }
    public static int updateith_bit(int num,int i,int bit){
        if(bit==0){
            return clearith_bit(num, i);
        }
        else{
            return setith_bit(num, i);
        }
    }

    //Second apporach:==
    public static int updateIth_bit(int num,int i,int newbit){
        num = clearith_bit(num, i);
        int bitmask = newbit<<i;
        return num|bitmask;
    }
    public static void main(String args[]){
        System.out.print(updateIth_bit(10, 1, 0));

        System.out.print(updateith_bit(10, 1, 0));

    }
}