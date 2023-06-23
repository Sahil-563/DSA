package Lecture_26;

public class wordbreakproblem {
    static class Node{
        Node children[]=new Node[26];
        boolean eow = false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root= new Node();
    public static void insert(String word){
        Node cur=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(cur.children[index]==null){
                cur.children[index]=new Node();
            }
            cur=cur.children[index];
        }
        cur.eow=true;
    }
    public static boolean search(String word){
        Node cur=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(cur.children[index]==null){
                return false;
            }
            cur=cur.children[index];
        }
        return cur.eow==true;
    }

    public static boolean wordbreak(String key){
        if(key.length()==0){
            return true;
        }
        for (int i=1;i<=key.length();i++){
            if(search(key.substring(0, i))&& wordbreak(key.substring(i))){
                return true;
            }
       
        }
        return false;
        
    }
    public static void main(String args[]){
        String arr[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordbreak(key));
         
    }
    
}
