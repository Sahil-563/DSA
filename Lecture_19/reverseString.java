package Lecture_19;
import java.util.*;
public class reverseString {
    public static String reverseStr(String str){
        Stack <Character> st = new Stack<Character>();
        int indx =0;
        while(indx<str.length()){
            st.push(str.charAt(indx));
            indx++;
        }
        StringBuilder sb = new StringBuilder("");
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        String str = "abc";
        String result = reverseStr(str);
        System.out.println(result);
        
    }
    
}
