import java.util.*;
public class q5 {
    public static String getStartingpt(HashMap<String, String>map1){
        HashMap<String,String> map2 = new HashMap<String,String>();
        for (String key: map1.keySet()) {
            map2.put(map1.get(key), key);
        }
        for (String key: map1.keySet()) {
            if(!map2.containsKey(key)){
                return key;
            }
        }
        return null;

    }
    public static void main(String[] args){
        HashMap<String,String> map1 = new HashMap<String,String>();
        map1.put("Chennai", "Bengaluru");
        map1.put("Mumbai", "Delhi");
        map1.put("Goa", "Chennai");
        map1.put("Delhi", "Goa");
        String startingpt = getStartingpt(map1);
        System.out.print(startingpt);
        for (String key : map1.keySet()) {
            System.out.print("-->"+map1.get(startingpt));
            startingpt = map1.get(startingpt);
        }

        
    }
}
