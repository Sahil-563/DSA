//Table of a number entered by the user:-
import java.util.*;
public class q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose table you want: ");
        int num = sc.nextInt();
        int res;
        int i = 1;
        while(i<=10){
            res = num*i;
            System.out.println(res);
            i++;
        }
    }
    
}
