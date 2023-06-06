package Lecture_21;
import java.util.*;
public class q1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int start[] = {1,3,0,5,8,5};
        int end[] = {9,4,6,7,9,2}; 
        //if arrray is not sorted in ascending order in end
        int activity[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        //For sorting 2-D array
        Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));
        int maxActivity = 1;
        int lastEnd = activity[0][2];
        list.add(activity[0][0]);
        for(int i=1;i<end.length;i++){
            if(activity[i][1]>=lastEnd){
                list.add(activity[i][0]);
                maxActivity+=1;
                lastEnd = activity[i][2];
            }
        }
        System.out.println(maxActivity);
        for(int i=0;i<list.size();i++){
            System.out.print("A"+list.get(i)+" ");
        }
    }
    
}
