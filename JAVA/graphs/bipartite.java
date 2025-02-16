import java.util.*;
import java.util.LinkedList;
public class bipartite{
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int[] col = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0?1:0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        }
                        else if(col[e.dest] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        ArrayList<Edge>[] graph1 = new ArrayList[4];
        ArrayList<Edge>[] graph2 = new ArrayList[5];

        for(int i=0; i<graph1.length; i++){
            graph1[i] = new ArrayList<>();
        }
        for(int i=0; i<graph2.length; i++){
            graph2[i] = new ArrayList<>();
        }

        //graph1
        graph1[0].add(new Edge(0,1,1));
        graph1[0].add(new Edge(0,2,1));

        graph1[1].add(new Edge(1,0,1));
        graph1[1].add(new Edge(1,3,1));

        graph1[2].add(new Edge(2,0,1));
        graph1[2].add(new Edge(2,3,1));

        graph1[3].add(new Edge(3,1,1));
        graph1[3].add(new Edge(3,2,1));
        
        //graph2
        graph2[0].add(new Edge(0,1,1));
        graph2[0].add(new Edge(0,4,1));

        graph2[1].add(new Edge(1,0,1));
        graph2[1].add(new Edge(1,2,1));

        graph2[2].add(new Edge(2,1,1));
        graph2[2].add(new Edge(2,3,1));

        graph2[3].add(new Edge(3,2,1));
        graph2[3].add(new Edge(3,4,1));

        graph2[4].add(new Edge(4,0,1));
        graph2[4].add(new Edge(4,3,1));
        
        //

        System.out.println(isBipartite(graph1));
        System.out.print(isBipartite(graph2));
    }
}