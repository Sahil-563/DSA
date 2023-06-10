package Lecture_23;

public class Validate_BST {
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

    public static boolean isValid(Node root,Node min,Node max){
        if(root == null){
            return true;
        }
        if(min!=null && root.data<=min.data){//This condition is for right subtree
            return false;
        }
        else if(max!=null && root.data>=max.data){//This condition is for left subtree
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right,root,max);
        

    }
    public static void main(String[] args){
        int arr[] = {80,70,90,60,75,85,100};
        Node root = null;
        for(int i = 0; i < arr.length; i++){
            root = insert(root, arr[i]);
        }
        Node min = null;
        Node max = null;
        System.out.println(isValid(root, min,max));
        
    }
    
}
