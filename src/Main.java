import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаем три графа разного размера согласно заданию [cite: 59-62]
        Graph smallGraph = createRandomGraph(10);
        Graph mediumGraph = createRandomGraph(30);
        Graph largeGraph = createRandomGraph(100);

        // Запускаем эксперименты и выводим результаты [cite: 70-72]
        System.out.println("=== GRAPH TRAVERSAL EXPERIMENTS ===");

        // Для маленького графа выведется и порядок обхода, и время
        Experiment.runTraversals(smallGraph, 0, "Small (10 vertices)");

        // Для средних и больших — в основном для замера времени
        Experiment.runTraversals(mediumGraph, 0, "Medium (30 vertices)");
        Experiment.runTraversals(largeGraph, 0, "Large (100 vertices)");
    }

    // Вспомогательный метод для автоматического создания связей
    private static Graph createRandomGraph(int vertices) {
        Graph g = new Graph();
        Random random = new Random();

        // 1. Добавляем вершины [cite: 37]
        for (int i = 0; i < vertices; i++) {
            g.addVertex(new Vertex(i));
        }

        // 2. Добавляем случайные ребра [cite: 38, 63]
        // Создаем примерно по 2 ребра на каждую вершину для плотности
        for (int i = 0; i < vertices * 2; i++) {
            int from = random.nextInt(vertices);
            int to = random.nextInt(vertices);
            if (from != to) {
                g.addEdge(from, to);
            }
        }
        return g;
    }
}