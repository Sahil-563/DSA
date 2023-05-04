import java.util.*;
public class q8 {
    public static boolean pairsum2(ArrayList<Integer> list,int target){
        int pivot = -1; //Invalid value abhi tk
        int n = list.size();
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                pivot =i;
                break;
            }
        }
        int lp =pivot+1;
        int rp = pivot;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp =(lp+1)%n;
            }
            else{
                rp =(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.print(pairsum2(list,16));
    }
    
}
