package Lecture_21;
import java.util.*;
public class q4{
    public static void main(String args[]){
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
        int chainlen =1;
        int end = pair[0][1];
        for(int i=1;i<pair.length;i++){
            if(pair[i][0]>end){
                chainlen++;
                end = pair[i][1];
            }
        }
        System.out.println(chainlen);
    }
}