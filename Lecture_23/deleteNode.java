package Lecture_23;

public class deleteNode {
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
    public static Node insert(Node root, int val){
        if(root == null){
            //root = 
            return new Node(val);
        }
        if(root.data >val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node deletenode(Node root,int val){
        if(root.data>val){
            root.left = deletenode(root.left,val);
        }
        else if(root.data<val){
            root.right = deletenode(root.right,val);
        }
        else{
            //Case1: When root has no child
            if(root.right == null && root.left == null){
                return null;
            }
            //Case2: When root right or left is null
            if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }
            //Case3: When root has both right and left children
            Node IS = findInorderSucc(root.right);
            root.data = IS.data;
            root.right = deletenode(root.right, IS.data);
        }
        return root;
    }
    
    public static Node findInorderSucc(Node node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }

    public static void main(String args[]){
        int arr[] = {8,5,10,3,4,1,6,11,14};
        Node root = null;
        for(int i = 0; i < arr.length; i++){
            root = insert(root, arr[i]);
        }
        inorder(root);
        deletenode(root, 5);
        System.out.println();
        inorder(root);
    }
    
}
