public class LinkedList {
    public class Nodes{
        int data;
        Nodes next;
        public Nodes(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Nodes head;
    public static Nodes tail;
    public static int size;
    
    public void addfirst(int data){
        Nodes newnode = new Nodes(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head; //here the address of head is passed not the value of head
        head  = newnode;
    }
    public void addlast(int data){
        Nodes newnode = new Nodes(data);
        size++;
        if(tail == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void add(int indx,int data){
        if(indx ==0){
            addfirst(data);
            return;
        }
        Nodes newnode = new Nodes(data);
        size++;
        Nodes temp = head;
        int i =0;
        while(i<indx-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }
    public int removeFirst(){
        int val = head.data;
        if(size == 0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            head = tail = null;
            size=0;
            return val;

        }
        
        head = head.next;
        size--;
        return val;
    }
    //Remove last
    public int removeLast(){
        int val = tail.data;
        if(size == 0){
            System.out.print("LL is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            head = tail =null;
            size =0;
            return val;
        }
        Nodes prev = head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }
        prev.next =null;
        tail = prev;
        size--;
        return val;
    }
    public void print(){
        if(head == null){
            System.out.print("LL is empty");
        }
        Nodes temp = head;
        while (temp!=null){
            System.out.print(temp.data + "-->");
            temp =temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.print();
        //ll.add(4,10);
        ll.removeFirst();
        ll.print();
        //System.out.println(ll.size);
        //ll.removeLast();
        //ll.print();
        //System.out.print(ll.size);
        
        
        
    }
        
}
    
    

