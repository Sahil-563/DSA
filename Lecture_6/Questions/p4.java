import java.util.*;
public class p4 {
    public static int trapped_water(int height[]){
        int leftmax[]=new int[height.length];
        int rightmax[]=new int[height.length];
        int n = height.length;
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trapped_water = 0;
        for(int i=0;i<n;i++){
            int water_level = Math.min(leftmax[i],rightmax[i]);
            trapped_water += (water_level-height[i]);
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.print(trapped_water(height));

        
    }
    
}
