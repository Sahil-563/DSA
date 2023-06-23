import java.util.*;
public class linkedHs {
    public static void main(String[] args){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(null);
        lhs.add(1);
        lhs.add(3);
        lhs.add(3);
        lhs.add(2);
        lhs.add(4);
        lhs.add(5);
        System.out.println(lhs);
    }
}
