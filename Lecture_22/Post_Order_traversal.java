package Lecture_22;


public class Post_Order_traversal {
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
    //PostOrder travesal
    public static void Postorder(Node root){
        if(root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data+" ");

    }
    public static void main(String args[]){
        int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildtree(Nodes);
        Postorder(root);
        // System.out.println(root.data);
        
        

    }
    
    
}

