public class q4 {
    public static int print_sum_of_natural_num(int num){
        if(num==0){
            return num;
        }
        int snm1=print_sum_of_natural_num(num-1);
        int sn =num+snm1;
        return sn;
    }
    public static void main(String args[]){
        System.out.print(print_sum_of_natural_num(4));

    }
    
}
