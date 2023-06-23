import java.util.*;
public class q3 {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();
        int arr[]={4,3,2,5,6,7,3,4,2,1};
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(!hs.contains(i)){
                hs.add(arr[i]);
                ans++;
            }
        }
        System.out.println(ans);
    }
    
}
