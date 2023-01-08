import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

class ThemeParkProblem {

    static int total_countries = 0;
    static int num_days = 0;

    static Graph graph;

    static HashMap<Integer, Integer> output = new HashMap<>();

    public static void main(String[] args) {
        try {
            File myObj = new File("sample input.txt");

            int i = 1;
            Scanner myReader = new Scanner(myObj);

            System.out.println("Adding countries: ");

            long start = System.currentTimeMillis();
            long end = start + ((60*4 + 30))*1000; // 4 minutes 30 seconds

            Thread[] threads = new Thread[total_countries];
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                if (i == 1) {
                    total_countries = Integer.parseInt(line.split(" ")[0]);
                    num_days = Integer.parseInt(line.split(" ")[1]);

                    graph = new Graph(total_countries + 1);
                    threads = new Thread[total_countries];
                }

                if (i > 1 && i <= total_countries) {
                    // System.out.println("Adding country: " + i);
                    graph.addEdge(Integer.parseInt(line.split(" ")[0]), Integer.parseInt(line.split(" ")[1]));

                    if (i == total_countries) {
                        System.out.println("Added all " + total_countries + " countries!");
                        System.out.println("(Program will find outputs for 4 minute and 30 seconds.)");
                    }
                }

                // System.out.println("Line number: " + i);

                // the days
                if (i > total_countries && i <= total_countries + num_days) {

                    final int counter = i;
                    threads[i - total_countries] = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            String[] split = line.split(" ");
                            int k = Integer.parseInt(split[0]);
                            int[] k_countries = new int[k];

                            int normal_price = 0;
                            int optimal_price = 0;

                            // getting k countries
                            for (int j = 0; j < k; j++) {
                                k_countries[j] = Integer.parseInt(split[j + 1]); // because 0 index is k

                                // finding the distance from k to 1 and adding it to normal price ( sum of all
                                // path distances to node with ID 1)
                                normal_price += graph.bfs(Integer.parseInt(split[j + 1]), 1);
                                // System.out.println("Normal distance: " + normal_price);
                            }

                            // finding the optimal price (sum of all distances to the centre of the current
                            // sub-graph)
                            // System.out.println("Graph center: " + graph.findCenter(k_countries));

                            for (int j = 0; j < k; j++) {
                                if (k_countries.length == 1) {
                                    optimal_price += 0;
                                } else if (k_countries.length == 2) {
                                    optimal_price += 1;
                                } else {
                                    optimal_price += graph.bfs(k_countries[j],
                                            graph.findCenter(k_countries));
                                }
                                // System.out.println("optimal distance: " + optimal_price);
                            }

                            // finding the difference of the price of delivery
                            int difference = normal_price - optimal_price;

                            // storing the difference
                            //output += difference + "\n";
                            output.put(counter, difference);

                            // if (counter % 1000 == 0) {
                            //     System.out.println("optimal distance of countries at line number " + counter + " : " + difference);
                            // }
                        }
                    });

                    threads[i-total_countries].start();
                    
                }

                if (System.currentTimeMillis() > end) {
                    break;
                }

                i++;
            }

            // waiting for all threads to finish
            for(int c=0; c<total_countries; c++) {
                if (threads[c] == null) continue;
                
                try {
                    threads[c].join(); // TODO Exception handling
                } catch (InterruptedException e) {

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input File Not found!");
            e.printStackTrace();
        }

        System.out.println("Writing the outputs inside a file...");

        try {
            FileWriter myWriter = new FileWriter("sample outputs.txt");

            // TreeMap to store values of HashMap
            TreeMap<Integer, Integer> sorted = new TreeMap<>();
    
            // Copy all data from hashMap into TreeMap
            sorted.putAll(output);
    
            // Display the TreeMap which is naturally sorted
            String outputs = "";
            for (Map.Entry<Integer, Integer> entry : sorted.entrySet())
                outputs += entry.getValue() + "\n";

            myWriter.write(outputs);
            myWriter.close();
        } catch (IOException e) {

        }

    }

}

@SuppressWarnings({ "unchecked" })
class Graph {

    private LinkedList<Integer> adjacency[];

    // Constructor to how many vertices are in the graph
    Graph(int vertices) {
        adjacency = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacency[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int source, int destination) {
        adjacency[source].add(destination);
        adjacency[destination].add(source);
    }

    int findCenter(int[] nodes_to_visit) {
        int min_combination = Integer.MAX_VALUE;
        int min_node = -1;

        if (nodes_to_visit.length == 1 || nodes_to_visit.length == 2) {
            return nodes_to_visit[0];
        }

        for (int i = 1; i < adjacency.length; i++) {
            if (adjacency[i].size() == 1) {
                continue;
            }

            // System.out.println("checking node: " + i);

            int combination = 0;

            for (int node : nodes_to_visit) {
                combination += bfs(i, node);
            }

            if (combination < min_combination) {
                min_combination = combination;
                min_node = i;
            }
        }

        return min_node;
    }

    int bfs(int source, int destination) {
        boolean visit[] = new boolean[adjacency.length];
        int parent[] = new int[adjacency.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        parent[source] = -1;
        visit[source] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (cur == destination)
                break;

            for (int neighbour : adjacency[cur]) {
                if (!visit[neighbour]) {
                    visit[neighbour] = true;
                    queue.add(neighbour);
                    parent[neighbour] = cur;
                }
            }
        }
        int cur = destination;
        int distance = 0;

        while (parent[cur] != -1) {
            // System.out.println(cur + " -> ");
            cur = parent[cur];
            distance++;
        }
        return distance;
    }
}