
import java.util.*;
public class internalmplementation {
    static class HashMap<K, V>{//This is a generic
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N =4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashfunction(K key){
            int hashCode = key.hashCode();
            return Math.abs(hashCode)%N;
        }
        private int searchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node = ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i = 0;i<N;i++){
                buckets[i]=new LinkedList<>();
            }
            for(int i =0;i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0;j<ll.size();j++){
                    Node node = ll.remove();
                    put(node.key,node.value);
                }
            }

        }
        public void put(K key, V value){
            int bi = hashfunction(key);
            int di = searchInLL(key,bi);
            if(di!=-1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda = (double)n/N;
            if(lambda<2.0){
                rehash();
            }

        }
        public boolean containKeys(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key,bi);
            if(di!=-1){
                return true;
            }
            else{
                return false;
            }
        }
        public V get(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key,bi);
            if(di!=-1){
                Node node = buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }
        }
        public V remove(K key){
            int bi = hashfunction(key);
            int di = searchInLL(key,bi);
            if(di!=-1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;

        }
    } 
    public static void main(String args[]){
         HashMap<String ,Integer> hm = new HashMap<>();
         hm.put("India",150);
         hm.put("China",0);
         hm.put("England",10);
         ArrayList<String> keys= hm.keySet();
         for (String key : keys) {
            System.out.println(key);
        }
    }
}

