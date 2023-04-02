  //Print numbers form 1 to n
import java.util.*;
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number upto which you want to print number: ");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++){
            System.out.print(i+" ");
        }

    }
    
}
