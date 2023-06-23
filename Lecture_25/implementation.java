
import java.util.*;
public class implementation {
    public static void main(String[] args){
        HashMap<String,Integer> hm = new HashMap<>();
        
        hm.put("Apple", 30);
        hm.put("Banana", 40);
        hm.put("Mango", 25);
        hm.put("Litchi", 60);
        System.out.println(hm);
        System.out.println(hm.get("Banana"));
        System.out.println(hm.containsKey("Litchi")); //Returns True or False
        System.out.println(hm.remove("Litchi")); //Removes
        System.out.println(hm.get("Litchi")); 
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println(hm.keySet());
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm);
        
    }
}
