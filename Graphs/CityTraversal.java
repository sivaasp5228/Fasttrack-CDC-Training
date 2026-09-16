import java.util.*;
public class CityTraversal {
    static void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;
        System.out.print(node + " ");
        for(int neighbour: graph.get(node)) {
            if(!visited[neighbour]) {
                dfs(neighbour, visited, graph);
            }
        }
    }
    public static void main(String[] args) {
        int vertices = 9;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(2).add(0);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(0).add(3);
        graph.get(0).add(4);
        graph.get(0).add(5);
        graph.get(0).add(6);
        graph.get(0).add(7);
        graph.get(8).add(2);

        boolean[] visited = new boolean[vertices];

        dfs(8, visited, graph);
    } 
}