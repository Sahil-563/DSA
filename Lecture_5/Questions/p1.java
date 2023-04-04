//Average of three numbers:--
import java.util.*;
public class p1 {
    public static int average(int num1,int num2,int num3){
        return((num1+num2+num3)/3);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter your third number: ");
        int num3 = sc.nextInt();
        int res = avg(num1, num2, num3);
        System.out.print("The average of three numbers is: " +res);

        
    }
    
}
