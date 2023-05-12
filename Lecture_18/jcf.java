import java.util.LinkedList;
public class jcf {
    public static void main(String args[]){
        LinkedList<Integer>ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        System.out.print(ll);
        ll.removeFirst();
        System.out.print(ll);
    }
    
}
