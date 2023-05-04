import java.util.*;
public class p1 {
    public static boolean ismonotone(ArrayList<Integer>l1){
        boolean inc = true;
        boolean dec = true;
        for(int i=0;i<l1.size()-1;i++){
            if(l1.get(i)<l1.get(i+1)){
                dec = false;
            }
            if(l1.get(i)>l1.get(i+1)){
                inc = false;
            }
            
        }
        return inc||dec;

    }
    public static void main(String args[]){
        ArrayList <Integer> l1 =new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(2);
        System.out.print(ismonotone(l1));
    }
    
}
