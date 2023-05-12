public class merge_sort_ll {
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
    public static void print(){
        Node temp = head;
        for(int i=0;i<size;i++){
            System.out.print(temp.data+"-->");
            temp= temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast.next!=null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
    }
    return slow;
    }

    private Node merge(Node head1 , Node head2){
        Node mergell  = new Node(-1);
        Node temp = mergell;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1  = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2  = head2.next;
                temp = temp.next;

            }
        }
        while(head1!=null){
            temp.next = head1;
            head1  = head1.next;
            temp = temp.next;

        }
        while(head2!= null){
            temp.next = head2;
            head2  = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }


    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft=mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft , newRight);
    }
    

    public static void main(String args[]){
        merge_sort_ll ll = new  merge_sort_ll();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();

        
        

    }
    
}
