import java.util.Scanner;

//Leap year or not:--
public class p4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean x = num%4==0;
        boolean y= !(num%100==0);
        boolean z = (num%400==0)&&(num%100==0);
        if (x&&(y||z)){
            System.out.println("This is a leap year");

        }
        else{
            System.out.print("This is not a leap year");
        }





    }
}
        