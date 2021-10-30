package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
      // other implementation
      return null;
   }

   // TODO: Your answer
   Object contains(List<Object> list, String p) {
	   for (Object obj : list) {
		   try {
			   if (((Node)obj).contains(p) ||
					   ((Edge)obj).contains(p)) {
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