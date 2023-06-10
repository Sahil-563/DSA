package Lecture_22;
public class subtreee{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node root, Node subroot){
        if(root == null && subroot == null){
            return true;
        }else if(root == null||subroot == null||root.data != subroot.data){
            return false;
        }
        if(!isIdentical(root.left, subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;


    }
    public static boolean isSubtree(Node node , Node subroot){
        if (node == null){
            return false;
        }
        if(node.data == subroot.data){
            if(isIdentical(node,subroot)){
                return true;
            }
        }
        return isSubtree(node.left, subroot)||isSubtree(node.right, subroot);
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        //Subtree
        Node subtree = new Node(2);
        subtree.left = new Node(4);
        subtree.right = new Node(5);
        System.out.print(isSubtree(root,subtree));
    }
}