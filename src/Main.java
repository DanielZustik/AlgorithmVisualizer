import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addConnection(new Connection(new Node(0), new Node(1)));
        graph.addConnection(new Connection(new Node(0), new Node(2)));
        graph.addConnection(new Connection(new Node(1), new Node(3)));
        graph.addConnection(new Connection(new Node(2), new Node(3)));
        graph.addConnection(new Connection(new Node(3), new Node(5)));
        graph.addConnection(new Connection(new Node(3), new Node(4)));
        graph.addConnection(new Connection(new Node(4), new Node(6)));
        graph.addConnection(new Connection(new Node(4), new Node(5)));
        graph.addConnection(new Connection(new Node(5), new Node(6)));

        RouteFinder routeFinder = new RouteFinder(graph);
    }
//        Nodes node0 = new Nodes(0, new Connection[]{new Connection(1),
//                new Connection(2)});
//        Nodes node1 = new Nodes(1, new Connection[]{new Connection(0),
//                new Connection(3)});
//        Nodes node2 = new Nodes(2, new Connection[]{new Connection(0),
//                new Connection(3)});
//        Nodes node3 = new Nodes(3, new Connection[]{new Connection(1),
//                new Connection(2),new Connection(4),new Connection(5)});
//        Nodes node4 = new Nodes(4, new Connection[]{new Connection(6),
//                new Connection(3),new Connection(5)});
//        Nodes node5 = new Nodes(5, new Connection[]{new Connection(3),
//                new Connection(4),new Connection(6)});
//        Nodes node6 = new Nodes(6, new Connection[]{new Connection(5),
//                new Connection(4)});
//
//        graphh operator = new graphh();
//        operator.addNodes(Arrays.asList(node0,node1, node2, node3, node4, node5, node6));



//        public static boolean checkIfConnectionExists (Nodes node, String connection) {
//            return node.getConnection()[0].toString().equals(connection);
//        }
}
