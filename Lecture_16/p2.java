import java.util.*;
public class p2{
    public static ArrayList<Integer> lonelynums(ArrayList<Integer>nums){
        Collections.sort(nums);
        ArrayList<Integer> newlist = new ArrayList<>();
        for(int i=1;i<nums.size()-1;i++){
            if(nums.get(i-1)+1<nums.get(i) && nums.get(i)+1<nums.get(i+1)){
                newlist.add(nums.get(i));
            }
        }
        if(nums.size()==1){
            newlist.add(nums.get(0));
        }
        if(nums.size()>1){
            if(nums.get(0)+1<nums.get(1)){
                newlist.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)<nums.get(nums.size()-1)){
                newlist.add(nums.get(nums.size()-1));
            }
        }
        return newlist;

    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(3);
        System.out.print(lonelynums(nums));
    }
}