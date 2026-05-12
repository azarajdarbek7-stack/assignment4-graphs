import java.util.*;

public class Graph {
    // Список смежности: ID вершины -> Список соседей [cite: 35]
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        this.adjList = new HashMap<>();
    }

    // Добавляет вершину в граф [cite: 37]
    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    // Добавляет ребро (связь) между вершинами [cite: 38]
    public void addEdge(int from, int to) {
        if (adjList.containsKey(from) && adjList.containsKey(to)) {
            adjList.get(from).add(to);
            adjList.get(to).add(from); // Делаем граф ненаправленным [cite: 63]
        }
    }

    // Breadth-First Search (Поиск в ширину) [cite: 41, 65]
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " "); // Печатаем порядок обхода [cite: 71]

            for (int neighbor : adjList.getOrDefault(vertex, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    // Depth-First Search (Поиск в глубину) [cite: 42, 66]
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
    }

    // Вспомогательный метод для рекурсии DFS [cite: 56]
    private void dfsHelper(int v, Set<Integer> visited) {
        visited.add(v);
        System.out.print(v + " ");
        for (int neighbor : adjList.getOrDefault(v, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    // Печать всего графа для проверки [cite: 39]
    public void printGraph() {
        for (int v : adjList.keySet()) {
            System.out.println("Vertex " + v + " is connected to: " + adjList.get(v));
        }
    }
}