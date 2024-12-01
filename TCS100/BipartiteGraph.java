import java.util.*;

public class BipartiteGraph {

    static class Edge{
        int src;
        int dest;

        public Edge(int x, int y){
            this.src = x;
            this.dest = y;
        }
    }

    static void xreateGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge
    }

}
