 //Binomial coefficient of a number:--
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
    public static int BC(int n,int r){
        int res = Factorial(n)/(Factorial(r)*Factorial(n-r));
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value of n ");
        int n= sc.nextInt();
        System.out.print("Enter your value of r ");
        int r= sc.nextInt();
        int res = BC(n, r);
        System.out.print("Your nCr is "+ res);
    }
} 
    

