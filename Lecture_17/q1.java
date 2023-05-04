public class q1 {
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
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public int searchKey(int key){
        Node temp = head;
        
        while(temp!=null){
            int i=0;
            if(temp.data == key){
                return i;
            }
            temp= temp.next;
            i++;
        }
        return -1;

    }
    public int helper(int key,Node head,int i){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return i;
        }
        return helper(key, head.next, i+=1);
        
    }
    public int recSearchKey(int key){
        return helper(key,head,0);
    }
    public static void main(String args[]){
        q1 ll = new q1();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        // System.out.print(ll.searchKey(3));
        System.out.print(ll.recSearchKey(4));
    }
    
}
