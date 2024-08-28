
import java.util.ArrayList;

public class Cycledetect {
    public class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;  
            this.wt = w;
        }}
        public static boolean cycledet(ArrayList<Edge>[] list){
            boolean vis[]=new boolean[list.length];
            for(int i=0;i<list.length;i++){
                if(!vis[i]){
                    if(detectcycleUtil(list, i, vis, -1)){
                        return true;
            }
        }
    }
    return false;
}
public static boolean detectcycleUtil(ArrayList<Edge>[] list, int curr, boolean vis[], int parent){
vis[curr]=true;
for(int i=0;i<list[curr].size();i++){
    Edge e=list[curr].get(i);
    if(!vis[e.dest] ){
        if(detectcycleUtil(list, e.dest, vis, curr)){
            return true;
        }
    }
    else if(vis[e.dest]&&e.dest!=parent){
        return true;
    }
}
return false;
}}
