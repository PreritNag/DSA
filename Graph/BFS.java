import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
    public static void bfs(ArrayList<Edge>[] list){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[list.length];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+"");
                vis[curr]=true;
                for(int i=0;i<list[curr].size();i++){
                    Edge e=list[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] list, int curr, boolean vis[]){
     System.out.println(curr+"");
     vis[curr]=true;
     for(int i=0;i<list[curr].size();i++){
         Edge e=list[curr].get(i);
         if(!vis[e.dest]){
             dfs(list, e.dest, vis);
         }
     }   
    }
    public static void main(String[] args) {
       int V=7;
       ArrayList<Edge>[] list = new ArrayList[V];
     for(int i=0;i<V;i++){
         list[i] = new ArrayList<>();
     }
     list[0].add(new Edge(0,1,1));
     list[0].add(new Edge(0,2,1));

     list[1].add(new Edge(1,0,1));
     list[1].add(new Edge(1,3,1));

     list[2].add(new Edge(2,0,1));
     list[2].add(new Edge(2,4,1));

     list[3].add(new Edge(3,1,1));
     list[3].add(new Edge(3,4,1));
     list[3].add(new Edge(3,5,1));

     list[4].add(new Edge(4,2,1));
     list[4].add(new Edge(4,3,1));
     list[4].add(new Edge(4,5,1));  

     list[5].add(new Edge(5,3,1));
     list[5].add(new Edge(5,4,1));
     list[5].add(new Edge(5,6,1));

     list[6].add(new Edge(6,5,1));

     bfs(list);

     dfs(list, 0, new boolean[V]);
    //  for(int i=0;i<list[2].size();i++){
    //     Edge e=list[2].get(i);
    //     System.out.println(e.dest);
    //  }

}}
