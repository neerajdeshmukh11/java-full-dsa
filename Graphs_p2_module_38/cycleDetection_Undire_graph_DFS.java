import java.util.ArrayList;

public class cycleDetection_Undire_graph_DFS {

    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.dest = dest;
            this.src = src;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if(detectCycleUtil(graph, visited, i, -1)){
                    return true;
                    // clcle exists in one of the parts
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean visited[], int curr, int par) {

        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            // case3
            if(!visited[e.dest]){
                if(detectCycleUtil(graph, visited, e.dest, curr)){
                    return true;
                }
                // case 1
            }else if(visited[e.dest] && e.dest != par){
                return true;
            }
            //case 2 do nothing / continue

        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
