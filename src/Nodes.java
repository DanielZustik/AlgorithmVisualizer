import java.util.ArrayList;

public class Nodes {
    private int node;
    private Connections[] connections;

    public Nodes(int node, Connections[] connections) {
        this.node = node;
        this.connections = connections;
    }

    public Connections[] getConnections() {
        return connections;
    }
}
