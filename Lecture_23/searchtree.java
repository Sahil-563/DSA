package Lecture_23;

public class searchtree{
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

    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data >key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }
        

    }

    public static void main(String[] args){
        int arr[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0; i < arr.length; i++){
            root = insert(root, arr[i]);
        }
        System.out.println(root.data);
        System.out.print(search(root, 8));
       
    }
}