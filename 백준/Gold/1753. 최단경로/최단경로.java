import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        List<List<Edge>> adjList = new ArrayList<>();
        for(int i=0; i<=V; i++) {
            adjList.add(new ArrayList<>());
        }

        int[] dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adjList.get(u).add(new Edge(v, w));
        }

        dist[K] = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.add(new Node(K, 0));

        while(! pq.isEmpty()) {
            Node current = pq.poll();
            if(dist[current.vertex] < current.weight) continue;

            for(Edge neighbor : adjList.get(current.vertex)) {
                int newDistance = current.weight + neighbor.weight;
                if(dist[neighbor.vertex] > newDistance) {
                    dist[neighbor.vertex] = newDistance;
                    pq.add(new Node(neighbor.vertex, newDistance));
                }
            }
        }
        for(int i=1; i<dist.length; i++) {
            if(dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
    }

    static class Edge {
        int vertex;
        int weight;

        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    static class Node {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}