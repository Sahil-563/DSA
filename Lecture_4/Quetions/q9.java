import java.util.*;
public class q9 {
    public static void main(String args[]){
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check if it is prime or not ");
        int num = sc.nextInt();
        for (int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag = false;
            }
        }
        if (flag == false){
            System.out.println(num+ " is not a prime number");
        }
        else{
            System.out.print(num+" is a prime number");
        }

    }
    
}
