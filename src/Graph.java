import java.util.ArrayList;

public class Graph {
    private ArrayList<Connection> connections = new ArrayList<>();

    public void addConnection (Connection connection) {
        connections.add(connection);
    }

    public ArrayList<Connection> getAllConnections() {
        return connections;
    }
}
