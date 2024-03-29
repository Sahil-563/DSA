import java.util.ArrayList;

import java.util.*;
public class q5 {
    public static int maxwater(ArrayList<Integer> height){
        int max_water =0;
        int lp=0;
        int rp = height.size()-1;
        while (lp<rp){
            int ht= Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currwater = ht*width;
            max_water = Math.max(currwater,max_water);
            if(lp<rp){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max_water;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.print(maxwater(height));
    }
    
}


