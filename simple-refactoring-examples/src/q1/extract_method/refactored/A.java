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
   Object contains(List list, String p) {
	   for (Object obj : list) {
		   try {
			   if ((obj instanceof Node && ((Node)obj).contains(p)) ||
					   (obj instanceof Edge && ((Edge)obj).contains(p))) {
				   System.out.println(obj);
			   }
		   } catch (ClassCastException e){
			   e.printStackTrace();
		   }
	   }
	   return null;
   }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}