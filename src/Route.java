import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Route {
    private ArrayList<Connection> connections;

    public Route(Connection... connections) {
        this.connections = new ArrayList<>();
        Collections.addAll(this.connections, connections);
    }

    public void editRoute (Connection connection) {
        connections.add(connection);
    }

    public ArrayList<Connection> getAllConections (){
        return connections;
    }
}
