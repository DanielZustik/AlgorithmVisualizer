import java.util.ArrayList;

public class RouteFinder {
    private Graph graph = new Graph();
    private ArrayList<Route> routes = new ArrayList<>();


    public Graph getGraph() {
        return graph;
    }

    public void routes () {
        int connection_ = 99;

        for (Connection connection : graph.getAllConnections()) {
            for (Route route : routes) {
                if (connection.node1().node() != connection_) {
                    routes.contains(connection_).route.editRoute(connection);
                    if (connection.node2().node() == route.getAllConections().getLast().node1().node()) {
                        route.editRoute(connection); //neni li stejne cislo pouze pridej k aktualni route jeji dalsi cast
                        break;
                    }
                } else {
                    routes.add(new Route(connection));
                    break;
                }
                connection_ = connection.node1().node(); //ulozeni node1 a pri pruchodu priste pujde tedy o predeslou hodnotu jiz existujici v grapfy
            }

        }


    }
}
