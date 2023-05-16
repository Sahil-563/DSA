package Lecture_19;
import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
public class q5 {
    static boolean isOpening(char c){
        return (c=='(' || c=='{' || c=='[');
    }
    static boolean isMatching(char a,char b){
        return ((a=='{'&& b=='}')||(a=='['&& b==']')||(a=='('&& b==')'));
    }
    public static boolean ispair(String paranthesis) {
        Stack <Character> s = new Stack<Character>();
        for(int i =0;i<paranthesis.length();i++){
            char curr = paranthesis.charAt(i);
            if(isOpening(curr)){
                s.push(curr);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else if(!isMatching(s.peek(),curr)){
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }
        return s.isEmpty();

    }
    public static void main(String arg[]){
        String paranthesis = "}";
        System.out.println(ispair(paranthesis));
        
    }
  
    
}
