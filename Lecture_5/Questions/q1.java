import java.util.*;
public class product {
    public static int res(int num1,int num2){
        int res = num1*num2;
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        int c=res(a,b);
        System.out.print(c);
    }
    

    
    
}
