public class Vertex {
    private int id; // Уникальный номер узла [cite: 19]

    public Vertex(int id) { // Конструктор [cite: 21]
        this.id = id;
    }

    public int getId() { // Геттер [cite: 22]
        return id;
    }

    @Override
    public String toString() { // Чтобы узел красиво печатался [cite: 23]
        return "Vertex " + id;
    }
}