import java.util.*;
public class q2 {
    public static void main(String args[]){
        ArrayList <Integer> list1= new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(3);
        list1.add(6);
        int max_no = Integer.MIN_VALUE;
        for(int i =0;i<list1.size();i++){
            // if(list1.get(i)>max_no){
            //     max_no = list1.get(i);
            // }
            max_no = Math.max(max_no,list1.get(i));
        }
        System.out.print(max_no);


    }
    
}
