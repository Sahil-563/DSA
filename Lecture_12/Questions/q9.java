public class q9 {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int a = power(x,n-1);
        int res = x*a;
        return res;
    }
    public static void main(String args[]){
        int x = 2;
        int n = 10;
        System.out.print(power(x,n));
    }
    
}
