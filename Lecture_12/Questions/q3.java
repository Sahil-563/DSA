import java.util.*;
public class q3 {
    public static int fact(int num){
        if(num==0){
            return 1;   //Base case
        }
        int fnm1 = fact(num-1);
        int fn = num*fnm1;
        return fn;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to calculate: ");
        int num = sc.nextInt();
        System.out.print(fact(num));

    }
    
}
