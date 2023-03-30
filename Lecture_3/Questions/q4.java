//Print the largest of three numbers:--
import java.util.*;
public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println(a+" is largest of three");
        }
        else if(b>=c){
            System.out.println(b+ " is largest of three");
        }
        else{
            System.out.println(c + " is largest of three");
        }
    
    
    }
    
}
