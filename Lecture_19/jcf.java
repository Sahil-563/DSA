package Lecture_19;
import java.util.*;
public class jcf {
    public static void main(String args[]){
        Stack <String> s = new Stack<>();
        s.push("Sahil");
        s.push("Vishal");
        s.push("Ishan");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
