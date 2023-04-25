public class q11 {
    public static int tillingProblem(int n){
        //base case
        if(n==0||n==1){
            return 1;
        }
        int fnm1 = tillingProblem(n-1);
        int fnm2 = tillingProblem(n-2);
        int totalWays = fnm1+fnm2;
        return totalWays;

    }
    public static void main(String args[]){
        int n = 3;
        System.out.print(tillingProblem(n));
    }
    
}
