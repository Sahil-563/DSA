
import java.util.*;
public class Iteration {
    public static void main(String[] args){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Apple", 30);
        hm.put("Banana", 40);
        hm.put("Mango", 25);
        hm.put("Litchi", 60);
        Set<String> keys = hm.keySet();
        for (String key: keys) {
            System.out.println(key + "=" + hm.get(key));
        }
       System.out.println(hm.entrySet());
    }
}
