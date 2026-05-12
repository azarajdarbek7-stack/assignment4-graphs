public class Edge {
    private Vertex source;      // Откуда идет дорога [cite: 27]
    private Vertex destination; // Куда идет дорога [cite: 28]

    public Edge(Vertex source, Vertex destination) { // Конструктор [cite: 30]
        this.source = source;
        this.destination = destination;
    }

    public Vertex getSource() { return source; }      // Геттеры [cite: 31]
    public Vertex getDestination() { return destination; }

    @Override
    public String toString() { // Печать связи [cite: 32]
        return source + " -> " + destination;
    }
}