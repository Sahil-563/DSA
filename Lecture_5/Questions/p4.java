//compute the sum of the integers:--
import java.util.*;
public class p4 {
    public static void sum(int num){
        int sum = 0;
        while(num!=0){
            int last_digit = num%10;
            sum+=last_digit;
            num/=10;
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        sum(num);
    }
    
}
