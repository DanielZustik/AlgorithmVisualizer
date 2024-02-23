package SSSPP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    public ArrayList<SSSPP.GraphNode> nodeList= new ArrayList<>();
    int[][] adjacencyMatrix;

    public Graph(ArrayList<SSSPP.GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1; //undirected so both ways

    }

    public ArrayList<SSSPP.GraphNode> getNeighbors(SSSPP.GraphNode node) { //takin index of row basicly and then if in column is 1,
        ArrayList<SSSPP.GraphNode> neighbors = new ArrayList<>();  //it means it s a  neighbor
        int nodeIndex = node.index;

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1) {
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    public void bfsVisit(SSSPP.GraphNode node) {
        List<SSSPP.GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            SSSPP.GraphNode currentNode = queue.remove(0); //acts like dequeue method. Removes it and returns it.
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<SSSPP.GraphNode> neighbors = getNeighbors(currentNode);
            for (SSSPP.GraphNode neighbor : neighbors) {
                if (!neighbor.isVisited) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void bfs () { //for disconnected nodes.. ensuring whole graph is traversed
        for (SSSPP.GraphNode node : nodeList) {
            if (!node.isVisited) {
                bfsVisit(node);
            }
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + " ");
        }
        s.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            s.append(nodeList.get(i).name + ": ");
            for (int j : adjacencyMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

}
