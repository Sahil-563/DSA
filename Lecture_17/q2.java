public class q2{
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
    //reversing a ll:--
    public static void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
    }
    public void removefrmLast(int n){
        int sz =0;
        Node temp = head;
        while(temp !=null){
            temp= temp.next;
            sz++;
        }

        if(n==sz){
            head = head.next;
            return;
        }
        int i =1;
        int itoFind=sz-n;
        Node prev = head;
        while(i<itoFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

        

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
        q2 ll = new q2();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.removefrmLast(2);
        //ll.reverseLL();
        ll.print();
    }
}