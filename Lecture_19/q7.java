package Lecture_19;
import java.util.*;
public class q7 {
    public static void main(String args[]){
        Stack <Integer> s = new Stack<Integer>();
        int arr[] = {2,4,6,3,1};
        int nextgreater []= new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i]=-1;
            }
            else{
                nextgreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i =0;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
    }
    
}

