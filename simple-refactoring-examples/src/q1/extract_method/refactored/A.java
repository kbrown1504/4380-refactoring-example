package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      contains(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
      contains(edgeList, p);
      return null;
   }

   // TODO: Your answer
   <T extends Graph> Object contains(List<T> list, String p) {
	   for (T obj : list) {
		   if (obj.contains(p)) {
			   System.out.println(obj);
		   }
	   }
	   return null;
   }
}

class Graph {
	String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Node extends Graph {
   
}

class Edge extends Graph {
   
}