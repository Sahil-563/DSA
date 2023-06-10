package Lecture_24;
import java.util.*;
public class insert_in_heap {
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int val){
            arr.add(val);
            int x = arr.size()-1;
            int par = (x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x = par;
                par = (x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = (2*i)+1;
            int right = (2*i)+2;
            int minindx = i;
            if(left<arr.size() && arr.get(minindx)>left){
                minindx = left;
            }
            if(right<arr.size() && arr.get(minindx)>right){
                minindx = right;
            }

            if(minindx!=i){
                int temp = arr.get(i);
                arr.set(i,arr.get(minindx));
                arr.set(minindx,temp);

                heapify(minindx);
            }
        }

        //remove from heap
        public int remove(){
            int data = arr.get(0);
            
            //swap the first and last elements
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //remove the last element
            arr.remove(arr.size()-1);

            //call heapify to fix the heap
            heapify(0);
            return data;

        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }

    }
    public static void main(String args[]){
        heap h = new heap();
        h.add(3);
        h.add(1);
        h.add(2);
        h.add(5);
        h.add(4);
        
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
    
}
