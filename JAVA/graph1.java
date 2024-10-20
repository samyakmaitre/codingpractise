import java.util.*;

import java.util.ArrayList;

class Edge {  // Moved Edge class outside the main method
    int src, dest, wt;

    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}

public class graph1 {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];

        // creating vertices
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // vertex 0
        Edge e = new Edge(0, 1, 5);
        graph[0].add(e);

        // vertex 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //vertex2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,4));

        //vertex 3
        graph[3].add(new Edge(3,2,1));
        graph[3].add(new Edge(3,1,3));

        //vertex 4
        graph[4].add(new Edge(4,2,2));


        // Print the graph to check the result
        for(int i=0; i<graph.length; i++){
            System.out.println("Vertex " + i);
            for(Edge x : graph[i]){
                System.out.println("Source: "+ x.src + " Destination: " + x.dest + " Weight: " + x.wt );
            }
            System.out.println();
        }
    }
}
