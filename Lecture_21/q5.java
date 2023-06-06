package Lecture_21;
import java.util.*;
public class q5 {
    public static void main(String args[]){
        Integer coins[] = {2000,500,100,50,20,10,5,2,1};
        int count =0;
        int amount = 590;
        Arrays.sort(coins,Comparator.reverseOrder());
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    ll.add(coins[i]);
                    amount = amount - coins[i];


                }
            }
        }
        System.out.println(count);
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" ");
        }
    }
    
}
