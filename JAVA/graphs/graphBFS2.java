import java.util.*;
import java.util.LinkedList;

public class graphBFS2{
    static class Edge{
        int src, dest, wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                bfsUtil(graph, i, vis);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, int start, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");

            for( Edge e : graph[curr]){
                if(!vis[e.dest]){
                    q.add(e.dest);
                    vis[e.dest] = true;
                }
            }
        }
    }

    public static void main(String[] args){
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

        bfs(graph);
    }
}