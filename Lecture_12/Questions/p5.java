//Tower of hanoi:--

public class p5 {
    public static void tower_of_hanoi(int n,String src,String helper ,String dest){
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        tower_of_hanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        tower_of_hanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        int n = 3;
        tower_of_hanoi(n, "s", "h", "d");

    }
    
}
