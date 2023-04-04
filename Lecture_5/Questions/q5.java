//Convert binary to decimal:--
import java.util.*;
public class q5 {
    public static void bin_to_dec(int bin){
        int dec_no = 0;
        int power = 0;
        while(bin!=0){
            int last_digit = bin%10;
            dec_no += (last_digit*(int)Math.pow(2,power));
            power++;
            bin/=10;
        }
        System.out.print(dec_no);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        bin_to_dec(num);


    }
}
    

