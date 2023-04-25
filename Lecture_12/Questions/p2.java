public class p2 {
    public static String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void print_dgt(int num){
        if(num == 0){
            return;
        }
        int last_dgt = num%10;
        print_dgt(num/10);
        System.out.print(arr[last_dgt]+" ");

    }
    public static void main(String args[]){
        int num = 2010;
        print_dgt(num);

    }

    
}
