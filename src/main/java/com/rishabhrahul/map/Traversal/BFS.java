package com.rishabhrahul.map.Traversal;

import com.rishabhrahul.map.Node.Node;

import java.util.*;

/**
 * This class will handel only BFS
 */
public class BFS {

   List BFS(HashMap<Node,List<Node>> adjacencyList, Node Start){
      Queue<Node> queue = new LinkedList<>();
      Set<Node> visited = new HashSet<>();
      List<Node> bfsList = new ArrayList<>();
      queue.add(Start);
      visited.add(Start);
      while(!queue.isEmpty()){

         Node pop = queue.poll();
         bfsList.add(pop);
         List<Node> neighbour = adjacencyList.get(pop);
         if(neighbour != null){
            for(int i = 0; i < neighbour.size(); i++){
               Node a = neighbour.get(i);
               if(!visited.contains(a)){
                  visited.add(a);
                  queue.add(a);
                  // and mark them visited
               }
            }
         }

      }

      return  bfsList;
   }

   //

   /**
    * Resource to share between are  BFS List,
    *
    * @return
    */
//   List BiBFS(){
//
//   }
}
