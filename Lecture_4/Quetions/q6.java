//Reversing a number in java
import java.util.*;
public class q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr number yo want to reverse: ");
        int num = sc.nextInt();
        int last_digit;
        while(num!=0){
            last_digit= num%10;
            System.out.print(last_digit);
            num /= 10;
        }
    }
    
}
