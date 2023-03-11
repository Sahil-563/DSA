import java.util.*;
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which you waant to calculate the sum: ");
        int num = sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum = sum+i;
        }
        System.out.print(sum);
    }
    
}
