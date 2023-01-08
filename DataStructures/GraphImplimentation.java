import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph{
    private LinkedList<Integer> adjacency[];
    // Constructor to how many vertices are in the graph
    Graph(int vertices){
        adjacency = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++){
            adjacency[i] = new LinkedList<Integer>();
        }
    }
    void addEdge(int source, int destination){
        adjacency[source].add(destination);
        adjacency[destination].add(source);
    }
    int bfs(int source, int destination){
        boolean visit[] = new boolean[adjacency.length];
        int parent[] = new int[adjacency.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        parent[source] = -1;
        visit[source] = true;

        while (!queue.isEmpty()){
            int cur = queue.poll();
            if (cur == destination) break;

            for (int neighbour: adjacency[cur]){
                if (!visit[neighbour]){
                    visit[neighbour] = true;
                    queue.add(neighbour);
                    parent[neighbour] = cur;
                }
            }
        }
        int cur = destination;
        int distance = 0;

        while (parent[cur] != -1){
            System.out.println(cur + " -> ");
            cur = parent[cur];
            distance++;
        }
        return distance;
    }
}
public class GraphImplimentation{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vertices and edges ");
        int vertices = input.nextInt();
        int edges = input.nextInt();
        Graph graph = new Graph(vertices);
        System.out.println("Enter " + edges + " edges");
        for (int i = 0; i < edges; i++){
            int source = input.nextInt();
            int destination = input.nextInt();

            graph.addEdge(source, destination);
        }

        System.out.println("Enter source and destination.");
        int source = input.nextInt();
        int destination = input.nextInt();
        
        int distance = graph.bfs(source, destination);
        System.out.println("Min distance is "+ distance);
        input.close();
    }
}
