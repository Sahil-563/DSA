package Lecture_23;
public class arrTobbst{
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
    public static Node BBST(int start,int end,int arr[]){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = BBST(start, mid-1, arr);
        root.right = BBST(mid+1, end,arr);
        return root;
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String args[]){
        int arr[]={3,5,6,8,10,11,12};
        Node root =BBST(0,arr.length-1,arr);

        inOrder(root);
        
    }
}