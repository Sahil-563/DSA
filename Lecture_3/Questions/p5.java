//make a calculator using switch statement
import java.util.*;
public class p5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a =sc.nextInt();
        System.out.print("Enter your second number: ");
        int b =sc.nextInt();
        System.out.print("Enter your operator: ");
        char c = sc.next().charAt(0);
        switch(c){
            case '+':System.out.print(a+b);
            break;
            case '-':System.out.print(a-b);
            break;
            case '*':System.out.print(a*b);
            break;
            case '/':System.out.print(a/b);
            break;
            case '%':System.out.print(a%b);
            break;
            default:System.out.print("No match found");
        }
    }
    
}
