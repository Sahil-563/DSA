public class q10 {
    public static int optimizedPower(int a ,int n){
        if(n ==0){
            return 1;
        }
        int halfpower = optimizedPower(a,n/2);
        int halfpowersq = halfpower*halfpower;
        if(n%2!=0){
            halfpowersq = a*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String args[]){
        int n = 10;
        int a = 2;
        System.out.print(optimizedPower(a, n));
    }
    
}
