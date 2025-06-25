import java.util.ArrayList;

public class Connected_comp_DFS {
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

    public static void CreateGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
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
    }
    
    public static void DFS(ArrayList<Edge> graph[]) {
    boolean visited[] = new boolean[graph.length];
    int count = 0;

    for (int i = 0; i < graph.length; i++) {
        if (!visited[i]) {
            System.out.print("Component " + (count + 1) + ": ");
            Depth_FS_Util(graph, i, visited);
            System.out.println();
            count++;
        }
    }
}

    public static void Depth_FS_Util(ArrayList<Edge> graph[],int curr,boolean visited[]){ // O(V+E)
        // visit
        System.out.print(curr+" "); 
        
        visited[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                Depth_FS_Util(graph, e.dest, visited); 
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        CreateGraph(graph);
        DFS(graph);
    }
}
