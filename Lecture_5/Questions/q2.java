//Factorial of a number:--
import java.util.*;
public class q2{
    public static int Factorial(int num2){
        int fact =1;
        while(num2!=0){
            fact = fact*num2;
            num2--;
        }
        return fact;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number whose factorial you want to calculate: ");
        int a = sc.nextInt();
        int res = Factorial(a);
        System.out.print(res);
    }
}