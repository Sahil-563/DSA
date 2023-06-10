package Lecture_23;

public class print_in_range {
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

    public static void range(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data < k1 && root.data<k2){
            range(root.right,k1,k2);
        }
        else if(root.data > k1 && root.data>k2){
            range(root.left, k1, k2);
        }
        else{
            range(root.left, k1, k2);
            System.out.print(root.data+" ");
            range(root.right, k1, k2);
        }
    }
    public static void main(String[] args){
        int arr[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i < arr.length; i++){
            root = insert(root, arr[i]);
        }
        // System.out.println(root.data);
        range(root, 5,10);
        
    }
    
}
