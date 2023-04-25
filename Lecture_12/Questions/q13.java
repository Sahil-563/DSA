public class q13 {
    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1= friendsPairing(n-1);
        int fnm2 = n-1*friendsPairing(n-2);
        int total_ways = fnm1+fnm2;
        return total_ways;


    }
    public static void main(String args[]){
        int n = 3;
        System.out.println(friendsPairing(n));
    }
    
}
