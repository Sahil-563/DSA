//Print largest of two numbers entered by the user:--
import java.util.*;
public class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is largest of two");
        }
        else{
            System.out.println(b+ " is largest of two");
        }

    }
    
}
