public class q5 {
    public static int fibo(int n){
        if(n==0|n==1){
            return n;
        }
        int fibnm1 = fibo(n-1);//Vishwas rakhna hai chota function apna kaam krke dega
        int fibnm2 = fibo(n-2);
        int fibn =fibnm1 +fibnm2 ;
        return fibn;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.print(fibo(n));
    }
    
}
