public class cyclicll{
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
    //Code for detecting cyclic
    public static boolean iscyclic(){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //code for removing cycle
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast.next!=null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //finding meeting point
        slow = head;
        Node prev = null;
        while(slow == fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        prev.next = null;

    }


    public static void print(){
        Node temp = head;
        for(int i=0;i<size;i++){
            System.out.print(temp.data+"-->");
            temp= temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String args[]){
        cyclicll ll = new cyclicll();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        ll.print();

    }
}