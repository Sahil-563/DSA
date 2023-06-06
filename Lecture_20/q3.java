package Lecture_20;
import java.util.*;
public class q3{
    public static void firstNRC(String str){
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            q.add(curr);
            freq[curr-'A']++;
            while(!q.isEmpty()&&freq[q.peek()-'A']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("#"+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }

    }
    public static void main(String[] args){
        String str = "AABCCXB";
        firstNRC(str);
        
    }
    
}
