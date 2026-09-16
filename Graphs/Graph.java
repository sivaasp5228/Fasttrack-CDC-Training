import java.util.*;
public class Graph {
    public static void main(String[] args) {
        //Adjacency Matrix Representation of Graph
        //int vertices = 4;
        //int[][] graph = new int[vertices][vertices];
        // A=0 B=1 C=2 D=3
        // A->B
        //graph[0][1] = 1;
        //graph[1][0] = 1;
        // B->D
        //graph[1][3] = 1;
        //graph[3][1] = 1;
        // A->C
        //graph[0][2] = 1;
        //graph[2][0] = 1;
        // C->D
        //graph[2][3] = 1;
        //graph[3][2] = 1;

        //System.out.println("Adjacency Matrix: ");
        //For(int i = 0; i < vertices; i++) {
        //    for(int j = 0; j < vertices; j++) {
        //        System.out.print(graph[i][j] + " ");
        //    }
        //    System.out.println();
        //}
        //Adjacency List Representation of Graph
        int vertices = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        // A=0 B=1 C=2 D=3
        addEdge(graph,0,1); // A->B
        addEdge(graph,0,2); // A->C
        addEdge(graph,1,3); // B->D
        addEdge(graph,2,3); // c->D

        for(int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for(int node: graph.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}