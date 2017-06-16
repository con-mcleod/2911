import java.util.ArrayList;
import java.util.HashMap;

public class ConcreteGraph<E> implements HashmapGraph<E> {
	
	HashMap<E, ArrayList<E>> connections;
	
	public ConcreteGraph() {
		connections = new HashMap<E, ArrayList<E>>();
	}

	public void addNode(E node) {
		if(!connections.containsKey(node)) {
			connections.put(node, new ArrayList<E>());
		}
	}

	public void removeNode(E node) {
		if(connections.containsKey(node)) {
			connections.remove(node);
		}
	}

	public void addEdge(E node1, E node2) {
		//ArrayList<E> edges1 = connections.get(node1);
		//ArrayList<E> edges2 = connections.get(node2);
		
		if(connections.containsKey(node1) && connections.containsKey(node2)) {
			//edges1.add(node2);
			//edges2.add(node1);
			//connections.put(node1, edges1);
			//connections.put(node2, edges2);
			
			connections.get(node1).add(node2);
			connections.get(node2).add(node1);
		}
	}

	public void removeEdge(E node1, E node2) {
		//ArrayList<E> edges1 = connections.get(node1);
		//ArrayList<E> edges2 = connections.get(node2);
		
		if(connections.containsKey(node1) && connections.containsKey(node2)) {
			//edges1.remove(node2);
			//edges2.remove(node1);
			//connections.put(node1, edges1);
			//connections.put(node2, edges2);
			
			connections.get(node1).remove(node2);
			connections.get(node2).remove(node1);
		}
	}

	public boolean hasNode(E node) {
		if (connections.containsKey(node)) return true;
		else return false;
	}

	public boolean isConnected(E node1, E node2) {
		return connections.get(node1).contains(node2);
	}

	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null || o.getClass() != this.getClass()) return false;
		
		ConcreteGraph<?> other = (ConcreteGraph<?>) o;
		if(other.connections.equals(this.connections)) return true;
		return false;
	}
}
