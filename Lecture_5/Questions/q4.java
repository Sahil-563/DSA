//Check a number is prime or not:--
import java.util.*;
public class q4 {
    public static boolean IsPrime(int num){
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        boolean res=IsPrime(num);
        if (res==true){
            System.out.print(num+" is a prime number");
        }
        else{
            System.out.print(num+" is a not a prime number");
        }
    }
    
}
