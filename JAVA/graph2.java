import java.util.*;

class Edge{
    int src;
    int dest;
    int wt;

    
    Edge(int s, int d, int w){
        this.src = s;
        this.dest= d;
        this.wt = w;
    }
}

public class graph2{

    static void createGraph(ArrayList<Edge> graph[]){
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2, 4, 1));
        
    }

    public static void main(String[] args){

    }
}