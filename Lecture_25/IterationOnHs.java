import java.util.*;
public class IterationOnHs {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(null);
        set.add(4);
        set.add(5);
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Enhanced For loop
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
