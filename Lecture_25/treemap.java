import java.util.*;
public class treemap {
    public static void main(String[] args){
        //In treeMap the keys are sorted on the basis of the alphabets if string
        TreeMap<String,Integer> lhm = new TreeMap<>();
        lhm.put("India",20);
        lhm.put("China",20);
        lhm.put("America",20);
        lhm.put("Indonesia",20);
        System.out.println(lhm);
        System.out.println(lhm.entrySet());
        
    }
}
