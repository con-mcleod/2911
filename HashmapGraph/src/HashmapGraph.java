
public interface HashmapGraph<E> {
	
	public void addNode(E node);
	public void removeNode(E node);
	
	public void addEdge(E node1, E node2);
	public void removeEdge(E node1, E node2);
	
	public boolean hasNode(E node);
	public boolean isConnected(E node1, E node2);
	
}