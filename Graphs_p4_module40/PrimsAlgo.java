import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.dest = dest;
            this.src = src;
            this.wt = wt;
        }
    }

    static class pair implements Comparable<pair>{
        int v;
        int cost;

        public pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
        @Override
        public int compareTo(pair p2){
            return this.cost - p2.cost; // ascending sorting
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    public static void Prims(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();

        pq.add(new pair(0, 0));
        int finalCost = 0; // total minimum cost

        while(!pq.isEmpty()){
            pair curr = pq.remove();

            if(!visited[curr.v]){
                visited[curr.v] = true;
                finalCost += curr.cost;

                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new pair(e.dest, e.wt));
                }
            }
        }

        System.out.println("Final cost of MST = "+ finalCost);
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        Prims(graph);
    }
}
