package Lecture_21;
import java.util.*;
public class q2 {
    public static void main(String[] args){
        int w []={10,20,30};
        int v[] ={60,100,120};
        int capacity =50;
        double ratio[][] = new double[w.length][2];
        for(int i = 0; i < w.length; i++){
            //iin this we have made a 2-d array which consist of indx and retio of value and weights
            ratio[i][0]=i;
            ratio[i][1]=v[i]/(double)w[i];
        }
        //Now we will sort this 2-d array in ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));//sorting in the basics of ratio
        int val = 0;
        //Now run a loop from n to 0 because we want ratios in desceding order
        for(int i = ratio.length-1;i>=0;i--){
            int indx = (int)ratio[i][0];
            
            if(capacity>=w[indx]){
                val += v[indx];
                capacity -= w[indx];
                
            }
            else{
                val += (capacity*ratio[i][1]);
                capacity =0;
                break;
            }
        }
        System.out.println(val);
    }
}
