package SSSPP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<SSSPP.GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new SSSPP.GraphNode("A", 0));
        nodeList.add(new SSSPP.GraphNode("B", 1));
        nodeList.add(new SSSPP.GraphNode("C", 2));
        nodeList.add(new SSSPP.GraphNode("D", 3));
        nodeList.add(new SSSPP.GraphNode("E", 4));

        SSSPP.Graph g = new SSSPP.Graph(nodeList);
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

        System.out.println(g);
        g.bfs();
    }
}
