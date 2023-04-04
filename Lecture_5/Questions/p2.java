//Is even?:--
import java.util.*;
public class p2 {
    public static boolean iseven(int num){
        boolean flag = false;
        if(num%2==0){
            flag = true; 
        }
        return flag;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check is it even or it?: ");
        int num = sc.nextInt();
        if(iseven(num)){
            System.out.print(num +" is a even number");
        }
        else{
            System.out.print(num +" is a odd number");

        }
    }
    
}
