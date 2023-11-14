package com.rishabhrahul.map.Traversal;

import com.rishabhrahul.map.Node.Node;

import java.util.*;

public class AdjacencyList {
  Map<Node, List<Node>> adjacencyList;
  // inorder to create a adjacent List we need a pair of edges
  // map will be later simplified
  AdjacencyList(Type t ){
    adjacencyList   = new HashMap<>();
    if(t.equals(Type.DIRECTED)) m = Type.DIRECTED;
    else  m = Type.DIRECTED;

  }
  Type m;
  enum Type{
    DIRECTED,
    UNDIRECTED
  }

 private void addToUnDirList(Node a, Node b){
    adjacencyList.putIfAbsent(a,new ArrayList<>());
    adjacencyList.get(a).add(b);

   adjacencyList.putIfAbsent(b,new ArrayList<>());
   adjacencyList.get(b).add(a);
  }

 private  void addToDirList(Node a, Node b){
   adjacencyList.putIfAbsent(a,new ArrayList<>());
   adjacencyList.get(a).add(b);
  }

  public void add(Node a , Node b){
    if(m.equals(1)) addToDirList(a,b);
    else addToUnDirList(a,b);

  }

 List<Node> get(Node a){
    if (!adjacencyList.containsKey(a)) return Collections.EMPTY_LIST ;
    else
      return adjacencyList.get(a);
  }


}
