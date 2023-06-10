package Lecture_22;
import java.util.*;
public class Pre_order_traversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int indx=-1;
        public static Node buildtree(int Nodes[]){
            indx++;
            if(Nodes[indx]==-1){
                return null;
            }
            Node newNode = new Node(Nodes[indx]);
            newNode.left = buildtree(Nodes);
            newNode.right = buildtree(Nodes);

            return newNode;
        
        }
        
    }
    //Traversing on BinaryTree
    //pre order traverse:--
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);

    }

    //leftView of BinaryTree
    static ArrayList<Integer> ll = new ArrayList<>();
    public static ArrayList<Integer> leftView(Node root){
        if(root == null){
            return null;
        }
        ll.add(root.data);
        leftView(root.left);
        return ll;
    }

    
    public static void main(String args[]){
        int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildtree(Nodes);
        // System.out.println(root.data);
        Preorder(root);
        //leftView(root);
        // for(int i=0;i<ll.size();i++){
        //     System.out.println(ll.get(i));
        // }

    }
    
    
}
