package Lecture_23;
import java.util.*;
public class mergeTwoBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);

    }
    public static void inOrder(Node root,ArrayList<Integer>ll){
        if(root == null){
            return;
        }
        inOrder(root.left, ll);
        ll.add(root.data);
        inOrder(root.right, ll);

    }

    public static Node createBST(ArrayList<Integer> l,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node newNode = new Node(l.get(mid));
        newNode.left=createBST(l, st, mid-1);
        newNode.right=createBST(l, mid+1, end);
        return newNode;
    }
    public static Node merge(Node root1,Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrder(root1,arr1);
        inOrder(root2,arr2);
        ArrayList<Integer> finallist = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size()&&j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finallist.add(arr1.get(i));
                i++;
            }
            else{
                finallist.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finallist.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finallist.add(arr2.get(j));
            j++;
        }

        return createBST(finallist,0,finallist.size()-1);
    }
    public static void main(String[] args){
        Node root1 = new Node(2);
        root1.right = new Node(4);
        root1.left = new Node(1);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node res=merge(root1, root2);
        Preorder(res);
    }
    
}
