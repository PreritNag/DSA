import java.util.ArrayList;

public class connectcomp {
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
    public static void dfs(ArrayList<Edge>[] list){
        boolean vis[]=new boolean[list.length];
        for(int i=0;i<list.length;i++){
            if(!vis[i]){
                dfsutil(list, i, vis);
            }
        }
    }
    public static void dfsutil(ArrayList<Edge>[] list, int curr, boolean vis[]){
     System.out.println(curr+"");
     vis[curr]=true;
     for(int i=0;i<list[curr].size();i++){
         Edge e=list[curr].get(i);
         if(!vis[e.dest]){
             dfsutil(list, e.dest, vis);
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

}
}