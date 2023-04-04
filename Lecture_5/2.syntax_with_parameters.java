import java.util.*;
public class syntax_with_parameters {
    public static int sum(int num1,int num2){ //Parameters/Formal parameters
        int sum = num1+num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you first number: ");
        int a = sc.nextInt();
        System.out.print("Enter you first number: ");
        int b = sc.nextInt();
        int res =sum(a,b);      //Arguments/Actual parameters
        System.out.print(res);
    }
    
}
