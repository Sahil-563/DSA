import java.util.*;
public class multidimensional_arraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(1); list1.add(2);
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainlist.add(list1);
        mainlist.add(list2);
        for(int i = 0;i<mainlist.size();i++){
            ArrayList<Integer>current_list = mainlist.get(i);
            for(int j=0;j<current_list.size();j++){
                System.out.print(current_list.get(j)+" ");
            }
            System.out.println();

        }

    }
    
}
