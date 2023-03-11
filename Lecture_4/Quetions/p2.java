import java.util.*;
public class p2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial yo want to calculate: ");
        int num = sc.nextInt();
        int fact = 1;
        while(num>0){
            fact = fact*num;
            num -= 1;
        }
        System.out.print(fact);
    }
    
}
