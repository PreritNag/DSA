import java.util.*;
public class AdjacencyList {
static class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}

    public static void main(String[] args) {
       int V=5;
       ArrayList<Edge>[] list = new ArrayList[V];
     for(int i=0;i<V;i++){
         list[i] = new ArrayList<>();
     }

     list[0].add(new Edge(0,1,5));
     list[1].add(new Edge(1, 0, 5));
     list[1].add(new Edge(1, 2, 1));
     list[1].add(new Edge(1, 3, 3));

     list[2].add(new Edge(2, 3, 1));
     list[2].add(new Edge(2, 1, 1));
     list[2].add(new Edge(2, 4, 2));

     list[3].add(new Edge(3, 1, 3));
     list[3].add(new Edge(3, 2, 1));

     list[4].add(new Edge(4, 2, 2));

     for(int i=0;i<list[2].size();i++){
        Edge e=list[2].get(i);
        System.out.println(e.dest);
     }

}}