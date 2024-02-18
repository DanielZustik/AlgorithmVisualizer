import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RouteFinder {
    private Graph graph;

    public RouteFinder(Graph graph) {
        this.graph = graph;
    }

    public ArrayList<Route> routes () {
        ArrayList<Route> routes = new ArrayList<>();

        int connection_ = 99;

        for (Connection connection : graph.getAllConnections()) {

            routes.add(new Route()); //first route
            if (connection.node1().node() != connection_) {
                routes.getFirst().editRoute(new Connection(connection.node1(), connection.node2())); //neni li stejne cislo pouze pridej k aktualni route jeji dalsi cast
            } else {
                routes.getFirst().editRoute(new Connection(connection.node1(), connection.node2())); //jeli stejne cislo pak jde o rozdvojeni a je treba zkopirovat routu doposud plus pridat novou cast
            }
            connection_ = connection.node1().node(); //ulozeni node1 a pri pruchodu priste pujde tedy o predeslou hodnotu jiz existujici v grapfy
        }
    }
}
