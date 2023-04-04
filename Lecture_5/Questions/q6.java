//Conversion of decimal to binary:--
import java.util.*;
public class q6 {
    public static void dec_to_bin(int dec_num){
        int power = 0;
        int bin_no = 0;
        while(dec_num>0){
            int remainder = dec_num%2;
            bin_no+=(remainder*(int)Math.pow(10,power));
            power ++;
            dec_num/=2;
        }
        System.out.print("Binary number: "+bin_no);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your decimal number: ");
        int num = sc.nextInt();
        dec_to_bin(num);
    }
    
}
