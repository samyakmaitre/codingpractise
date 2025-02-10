import java.util.*;

public class cycleDetection{
    static class Edge{
        int src, dest, wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(checkCycleUtil(graph, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par){
        vis[curr] = true;
        
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                if(checkCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
            }
            else if(vis[e.dest] && e.dest != par){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0;i<graph.length; i++){
            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,3,1));

            graph[1].add(new Edge(1,0,1));
            graph[1].add(new Edge(1,2,1));

            graph[2].add(new Edge(2,0,1));
            graph[2].add(new Edge(2,1,1));

            graph[3].add(new Edge(3,1,1));
            graph[3].add(new Edge(3,4,1));

            graph[4].add(new Edge(4,3,1));
        }
    }
}