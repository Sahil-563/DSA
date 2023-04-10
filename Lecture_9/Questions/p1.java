import java.util.*;
public class p1{
    public static int count_vowels(String str1){
        String str=str1.toLowerCase();
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str=sc.next();
        System.out.println("No. of vowels in your string: "+count_vowels(str));
    }
}