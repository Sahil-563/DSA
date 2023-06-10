package Lecture_23;
import java.lang.reflect.Array;
import java.util.*;
public class btToBST {
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

    
    public static void LevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void inorder(Node root,ArrayList<Integer> ll){
        
        if(root == null){
            return;
        }
        inorder(root.left,ll);
        ll.add(root.data);
        inorder(root.right,ll);
    }

    public static Node createbbst(int start,int end,ArrayList<Integer> ll){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(ll.get(mid));
        root.left = createbbst(start, mid-1, ll);
        root.right = createbbst(mid+1,end, ll);
        return root;
    }

    public static Node balanceBST(Node root){
        ArrayList<Integer>ll = new ArrayList<>();
        inorder(root,ll);
        Node node = createbbst(0, ll.size()-1, ll);
        return node;
    }
    public static void main(String args[]){
        int arr[] = {8,6,10,5,11,3,12};
        Node root = null;
        for(int i = 0; i < arr.length; i++){
            root = insert(root, arr[i]);
        }
        LevelOrder(root);
        root = balanceBST(root);
        LevelOrder(root);

    }
    
}
