package Lecture_26;

public class insertNode {
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
    
    public static void main(String args[]){
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
    }
}
