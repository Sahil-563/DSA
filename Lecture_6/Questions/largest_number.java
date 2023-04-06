import java.util.*;
public class largest_number {
    public static int larger_num(int numbers[]){
        int largest_number = Integer.MIN_VALUE;
        for(int i=0;i<(numbers.length);i++){
            if(largest_number<numbers[i]){
                largest_number=numbers[i];
            }
        }
        return largest_number;

    }

    //code for smallest number:--
    public static int Smaller_num(int numbers[]){
        int smallest_number = Integer.MAX_VALUE;
        for(int i=0;i<(numbers.length);i++){
            if(smallest_number>numbers[i]){
                smallest_number=numbers[i];
            }
        }
        return smallest_number;
    }
    public static void main(String args[]){
        int numbers[] ={1,2,4,3,9};
        System.out.println("Your largest number in array is: "+larger_num(numbers));
        System.out.println("Your smallest number in array is: "+Smaller_num(numbers));
    }
    
}
