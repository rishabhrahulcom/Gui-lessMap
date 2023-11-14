package com.rishabhrahul.map.ContractionHierarchies;

import com.rishabhrahul.map.Node.Node;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Contraction {
    Map<Node, List<Node>> adjacencyList;

    Contraction(Map m){
        this.adjacencyList = m;
    }

    void assignImportance() {
        for (Node node : adjacencyList.keySet()) {
            // more the size, more importance
            node.importance = node.neighbors.size();
            System.out.println("node value = " + node + node.importance +"<= imp");
        }
    }

    void contractNode(Node node) {

        for (Node neighbor1 : node.neighbors) {
            for (Node neighbor2 : node.neighbors) {
                if (neighbor1 != neighbor2 && !neighbor1.neighbors.contains(neighbor2)) {
                    // No direct edge, adding a shortcut
                    neighbor1.neighbors.add(neighbor2);
                    neighbor2.neighbors.add(neighbor1);

                }
            }
        }

    }

    void contractGraph() {
        List<Node> nodesByImportance = new ArrayList<>(adjacencyList.keySet());
        nodesByImportance.sort(Comparator.comparingInt(node -> node.importance));

        for (Node node : nodesByImportance) {
            contractNode(node);
        }
    }


}
