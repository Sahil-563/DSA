//income tax calculator:--
import java.util.*;
public class q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int tax;
        int income=sc.nextInt();
        if (income<500000){
            tax = 0;
        }
        else if(income>=500000 && income<=1000000){
            tax = (int)(income*0.2);
        }
        else {
            tax = (int)(income*0.3);
        }
        System.out.println("your tax is "+tax);

        
    }
    
}
