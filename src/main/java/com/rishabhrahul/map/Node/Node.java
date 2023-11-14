package com.rishabhrahul.map.Node;

import java.util.List;

public class Node {
    int index;
    public int importance;
    public List<Node> neighbors;

    int  getImportance(Node node){
        return node.importance;
    }

}

