
public class Tester {

	public static void main(String[] args) {
		
		//Can interchange <E> for Integer/String etc.
		HashmapGraph<Integer> g = new ConcreteGraph<Integer>();
		int node1 = 4;
		int node2 = 5;
		
		System.out.println("Adding node 1..");
		g.addNode(node1);
		System.out.println("Graph has node 1: " + g.hasNode(node1));
		System.out.println("Graph has node 2: " + g.hasNode(node2));
		
		System.out.println("\nAdding node 2..");
		g.addNode(node2);
		System.out.println("Graph has node 2: " + g.hasNode(node2));
		System.out.println("Edge between node 1 and node 2: " + g.isConnected(node1, node2));
		System.out.println("Edge between node 2 and node 1: " + g.isConnected(node2, node1));
		
		System.out.println("\nAdding edge between node 1 and node 2..");
		g.addEdge(node1, node2);
		System.out.println("Edge between node 1 and node 2: " + g.isConnected(node1, node2));
		System.out.println("Edge between node 2 and node 1: " + g.isConnected(node2, node1));
		
		System.out.println("\nRemoving edge between node 1 and node 2..");
		g.removeEdge(node2, node1);
		System.out.println("Edge between node 1 and node 2: " + g.isConnected(node1, node2));
		System.out.println("Edge between node 2 and node 1: " + g.isConnected(node2, node1));
		
		System.out.println("\nRemoving node 2..");
		g.removeNode(node2);
		System.out.println("Graph has node1: " + g.hasNode(node1));
		System.out.println("Graph has node2: " + g.hasNode(node2));
		
		///////////////////////////////////////////////
		
		System.out.println("\nCreating second graph, g2, containing node 1 and node 2");
		HashmapGraph<Integer> g2 = new ConcreteGraph<Integer>();
		g2.addNode(node1);
		g2.addNode(node2);
		
		System.out.println("g2 = g? " + g2.equals(g));
		
		System.out.println("Remove node 2");
		g2.removeNode(node2);
		System.out.println("g2 = g? " + g2.equals(g));
		System.out.println("g = g? " + g.equals(g));

		System.out.println("\nAll tests passed!");
	}

}
