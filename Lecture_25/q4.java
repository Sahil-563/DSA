import java.util.*;
public class q4 {
    public static void main(String[] args){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
        for(int i=0; i<arr1.length; i++){
            set1.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set1.add(arr2[i]);
        }
        System.out.println(set1);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i=0; i<arr1.length; i++){
            set2.add(arr1[i]);
        }
        int count =0;
        for(int i=0; i<arr2.length; i++){
            if(set2.contains(arr2[i])){
                count++;
                int ele = (arr2[i]);
                set2.remove(arr2[i]);
                System.out.println(ele);
            }
        }
        System.out.println(count);
                
    }
}
