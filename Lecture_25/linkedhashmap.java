//If you wantd your keys and values in same way as they are inserted
import java.util.*;
public class linkedhashmap {
    public static void main(String[] args){
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",20);
        lhm.put("China",20);
        lhm.put("America",20);
        lhm.put("Indonesia",20);
        System.out.println(lhm);
        System.out.println(lhm.entrySet());
        
    }
    
}
