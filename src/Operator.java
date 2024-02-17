import java.util.ArrayList;
import java.util.Collection;

public class Operator {
    private ArrayList<Nodes> nodes;

    public ArrayList<Nodes> addNodes (Collection<Nodes> newNodes) {
        nodes.addAll(newNodes);
        return nodes;
    }

    public boolean checkIfConnectionExists (Nodes node, String connection) {
        return node.getConnections()[0].toString().equals(connection);
    }
}
