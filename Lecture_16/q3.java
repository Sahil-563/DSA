import java.util.*;
public class q3 {
    public static void swap(ArrayList<Integer>list1,int indx1,int indx2){
        int temp = list1.get(indx1);
        list1.set(indx1,list1.get(indx2));
        list1.set(indx2,temp);

    }

    public static void main(String args[]){
        ArrayList <Integer> list1= new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(3);
        list1.add(6);
        int indx1 = 1 , indx2 = 3;
        System.out.println(list1);
        swap(list1,indx1,indx2);
        System.out.print(list1);
    }
    
}