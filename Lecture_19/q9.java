package Lecture_19;
import java.util.*;

public class q9 {
    public static void maxArea(int height[]){
        int maxArea = 0;
        int nextSmallerright[] = new int[height.length];
        int nextSmallerleft[] = new int[height.length];
        Stack<Integer> s = new Stack<>();
        for(int i = height.length-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()]>= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerright[i]=height.length;
            }
            else{
                nextSmallerright[i] = s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        for(int i=0;i <= height.length-1;i++){
            while(!s.isEmpty() && height[s.peek()]>= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerright[i]=height.length;
            }
            else{
                nextSmallerright[i] = s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<height.length;i++){
            int ht = height[i];
            int width = nextSmallerright[i]-nextSmallerleft[i]-1;
            int currArea = ht*width;
            maxArea = Math.max(maxArea, currArea);
            

        }
        System.out.println(maxArea);
    }
    public static void main(String args[]){
        int height[] = {2,1,5,6,2,3};
        maxArea(height);
        
        

    }
    
}
