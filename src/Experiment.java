public class Experiment {
    // Метод для запуска тестов и замера времени [cite: 46, 67-69]
    public static void runTraversals(Graph g, int startNode, String sizeLabel) {
        System.out.println("\n--- Testing Graph: " + sizeLabel + " ---");

        // Замер BFS [cite: 150]
        long startBfs = System.nanoTime();
        System.out.print("BFS Order: ");
        g.bfs(startNode);
        long endBfs = System.nanoTime();
        System.out.println("\nBFS Time: " + (endBfs - startBfs) + " ns");

        // Замер DFS [cite: 150]
        long startDfs = System.nanoTime();
        System.out.print("DFS Order: ");
        g.dfs(startNode);
        long endDfs = System.nanoTime();
        System.out.println("\nDFS Time: " + (endDfs - startDfs) + " ns");
    }
}