import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Nodes node0 = new Nodes(0, new Connections[]{new Connections(1),
                new Connections(2)});
        Nodes node1 = new Nodes(1, new Connections[]{new Connections(0),
                new Connections(3)});
        Nodes node2 = new Nodes(2, new Connections[]{new Connections(0),
                new Connections(3)});
        Nodes node3 = new Nodes(3, new Connections[]{new Connections(1),
                new Connections(2),new Connections(4),new Connections(5)});
        Nodes node4 = new Nodes(4, new Connections[]{new Connections(6),
                new Connections(3),new Connections(5)});
        Nodes node5 = new Nodes(5, new Connections[]{new Connections(3),
                new Connections(4),new Connections(6)});
        Nodes node6 = new Nodes(6, new Connections[]{new Connections(5),
                new Connections(4)});

        Operator operator = new Operator();
        operator.addNodes(Arrays.asList(node0,node1, node2, node3, node4, node5, node6));


    }
}