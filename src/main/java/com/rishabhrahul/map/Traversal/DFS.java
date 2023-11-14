package com.rishabhrahul.map.Traversal;

import com.rishabhrahul.map.Node.Node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DFS {

    Set<Node> visited  = new HashSet<Node>();

    List DFS(AdjacencyList adjacencyList, Node Start, Set visited, List<Node> travers){
        visited.add(Start);
        travers.add(Start);
        List<Node> a = adjacencyList.get(Start);
        if(a != null){
            for (Node ele: a) {
                    if(!visited.contains(ele))
                        DFS(adjacencyList,ele,visited,travers);
            }
        }
       return  travers;
    }
}
