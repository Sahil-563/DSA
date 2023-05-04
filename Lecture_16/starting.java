import java.util.*;
public class starting{
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList <> ();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        System.out.println(list1.get(2));
        list1.set(2,10);
        System.out.println(list1);
        System.out.println(list1.contains(1));
        list1.add(2,16);
        System.out.println(list1);
        System.out.println(list1.size());

    }
    
}