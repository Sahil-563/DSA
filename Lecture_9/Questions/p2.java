//Anagrams:--
import java.util.*;
public class p2{
    public static void isanagram(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        if(n==m){
            char charr1[]=str1.toCharArray();
            char charr2[]=str2.toCharArray();
            Arrays.sort(charr1);
            Arrays.sort(charr2);
            boolean result =Arrays.equals(charr1,charr2);
            if(result){
                System.out.print(str1+" and "+str2+" are anagrams of each other");
            }
            else{
                System.out.println(str1+" and "+str2+" are not anagrams of each other");
            }
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagrams of each other");
        }
        
    }
    public static void main(String args[]){
        String str1="race";
        String str2="scer";
        isanagram(str1, str2);
    }
}