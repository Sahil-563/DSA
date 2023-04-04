//Pallidrome or not?:--
import java.util.*;
public class p3 {
    public static boolean is_pallidrome(int num){
        int rev_no = 0;
        int temp = num;
        while(num!=0){
            int last_digit = num%10;
            rev_no = (rev_no*10)+last_digit;
            num/=10;
        }
        if (rev_no == temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        if(is_pallidrome(num)){
            System.out.print(num+" is a pallidrome number");
        }
        else{
            System.out.print(num+" is not a pallidrome number");
        }
    }
    
}
