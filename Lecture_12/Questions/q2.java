import java.util.*;
public class q2{
    public static void print_inc(int n){
        if(n == 0){
            return;
        }
        print_inc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        print_inc(num);
    }
}