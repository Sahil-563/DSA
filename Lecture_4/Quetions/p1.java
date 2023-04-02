import java.util.*;
public class p1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int evensum = 0;
        int oddsum = 0;
        char check;
        do{
            System.out.println("Enter your number");
            int num = sc.nextInt();
            if (num%2==0){
                evensum += num;
            }
            else{
                oddsum += num;
            }
            System.out.print("Do you want to continue if yes press y if no press n: ");
            check = sc.next().charAt(0);
        }
        while(check =='y');
        System.out.println(evensum);
        System.out.print(oddsum);


    }
    
}
