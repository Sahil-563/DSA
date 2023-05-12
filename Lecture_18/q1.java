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
    public void removeEle(){
        Node curr = head;
        Node nxt;
        while(curr.next!=null){
            nxt = curr.next;
            if(curr.data<nxt.data){
                curr = nxt;
            }
            else{
                curr= curr.next;
            }
        }
    }
    public static void main(String args[]){
        q1 ll = new q1();
        ll.addFirst(3);
        ll.addFirst(2); //12->15->10->11->5->6->2->3
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(11);
        ll.addFirst(10);
        ll.addFirst(15);
        ll.addFirst(12);
        ll.removeEle();
        ll.print();
        
    }
    
}
