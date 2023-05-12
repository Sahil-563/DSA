import javax.net.ssl.HandshakeCompletedListener;

public class zig_zag {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void zig_zag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reversing
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null && curr.next!=null){
            next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = next;
        }
        //Alternate linking
        Node left = head;
        Node right = prev;
        Node nextl ,nextR;
        while(left != null && right!= null){
            nextl = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextl;
            left = nextl;
            right = nextR;
        }
    }
    public static void print(){
        Node temp = head;
        for(int i=0;i<size;i++){
            System.out.print(temp.data+"-->");
            temp= temp.next;
        }
        System.out.print("null");
    }
    public static void main(String args[]){
        zig_zag ll = new  zig_zag();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.zig_zag();
        ll.print();
    }
}
