package DFS;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);
        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0,2);
        g.addUndirectedEdge(0,3);
        g.addUndirectedEdge(1,0);
        g.addUndirectedEdge(1,4);
        g.addUndirectedEdge(4,1);
        g.addUndirectedEdge(4,3);
        g.addUndirectedEdge(3,2);
        g.addUndirectedEdge(3,0);
        g.addUndirectedEdge(3,4);
        g.addUndirectedEdge(2,0);
        g.addUndirectedEdge(2,3);

        System.out.print(g);
        g.dfs();

        g = generateGraph(100);
        g.dfs();

    }

    /**
     * Generates a graph with a specified number of nodes.
     * Each node is connected to the next one to form a simple linear structure.
     * @param numberOfNodes The number of nodes to generate in the graph.
     * @return A Graph object populated with nodes and edges.
     */
    public static Graph generateGraph(int numberOfNodes) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        for (int i = 0; i < numberOfNodes; i++) {
            nodeList.add(new GraphNode("Node " + i, i));
        }

        Graph g = new Graph(nodeList);

        // Adding edges in a simple linear pattern: Node 0 -> Node 1 -> ... -> Node N
        for (int i = 0; i < numberOfNodes - 1; i++) {
            g.addUndirectedEdge(i, i + 1);
        }

        // Optionally, add more complex patterns or specific connections here

        return g;
    }
}
