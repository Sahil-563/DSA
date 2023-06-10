package Lecture_22;

public class In_Order_Traverse {
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
    //Inorder travese
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data+" ");
        Inorder(root.right);

    }
    public static void main(String args[]){
        int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildtree(Nodes);
        Inorder(root);
        // System.out.println(root.data);
        
        

    }
    
    
}
