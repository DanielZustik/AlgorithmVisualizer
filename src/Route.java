import java.util.ArrayList;

public class Route {
    ArrayList<Connection> connections;
    public void editRoute (Connection connection) {
        connections.add(connection);
    }
}
