
import java.util.ArrayList;

public class HasPath {
    static class Edge{
   int src;
   int dest;
   int wt;
   public Edge(int s, int d, int w){
    this.src=s;
    this.dest=d;
    this.wt=w;
   }
}
public static boolean haspath(ArrayList<Edge>[] graph,int src ,int dest, boolean vis[]){
    if(src==dest){
        return true;    
    }
    vis[src]=true;
    for(int i=0;i<graph[src].size();i++){
        Edge e=graph[src].get(i);
        if(!vis[e.dest]){
            if(haspath(graph,e.dest,dest,vis)){
                return true;
            }
        }
    }
    return false;
}
}
