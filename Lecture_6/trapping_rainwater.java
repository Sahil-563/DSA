import java.util.*;
public class trapping_rainwater {
    public static int trapped_rainwater(int height[]){
        int n = (height.length);
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        //Trapped water:--
        int trapped_water=0;
        for(int i =0;i<n;i++){
            int water_level = Math.min(leftmax[i],rightmax[i]);
            trapped_water += (water_level-height[i]);
        }
        return trapped_water;

    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.print(trapped_rainwater(height));

    }
    
}
