import java.util.Iterator;

public interface Set<E> extends Iterable<E> {
	
	public void add(E element);
	public void remove(E element);
	public int size();
	
	public boolean contains(Object o);
	public boolean equals(Object o);
	
	public Set<E> union(Set<E> set);
	public Set<E> intersection(Set<E> set);
	public boolean subset(Set<E> set);
	
	public Iterator<E> iterator();

	public String toString();
	
	public void print();
	
}
