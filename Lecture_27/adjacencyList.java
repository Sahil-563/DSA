package Lecture_27;
import java.util.*;
public class adjacencyList {
    static class Edge{
        int src;
        int dst;
        int wt;
        public Edge(int src, int dst, int wt){
            this.src = src;
            this.dst = dst;
            this.wt = wt; 
        }
    }
   
    public static void main(String[] args){
        int v= 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,5));

        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));

        graph[4].add(new Edge(4,2,4));
        

        //Now if you want to print the neighbors of a particular vertex you can do so
        // for(int i=0;i<graph[1].size();i++){
        //     Edge e = graph[1].get(i); //objects inside the arraylist
        //     System.out.println(e.wt);
        // }


        
        

    }
    
}
