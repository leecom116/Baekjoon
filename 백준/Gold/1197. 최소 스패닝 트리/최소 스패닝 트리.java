import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        boolean[] visited = new boolean[V + 1];
        int result = 0;

        for (int i = 0; i < E; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(c, b));
            graph.get(b).add(new Edge(c, a));
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>((e1, e2) -> e1.weight - e2.weight);
        pq.offer(new Edge(0, 1));

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            int weight = edge.weight;
            int node = edge.dest;

            if (!visited[node]) {
                visited[node] = true;
                result += weight;

                for (Edge nextEdge : graph.get(node)) {
                    if (!visited[nextEdge.dest]) {
                        pq.offer(nextEdge);
                    }
                }
            }
        }

        System.out.println(result);
    }
}

class Edge {
    int weight;
    int dest;

    public Edge(int weight, int dest) {
        this.weight = weight;
        this.dest = dest;
    }
}