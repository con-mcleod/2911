import java.util.ArrayList;
import java.util.Iterator;

public class ArraySet<E> implements Set<E> {
	
	private ArrayList<E> elementSet;
	
	public ArraySet() {
		elementSet = new ArrayList<E>();
	}

	public void add(E element) {
		if(!elementSet.contains(element)) {
			elementSet.add(element);
		}
	}

	public void remove(E element) {
		if(elementSet.contains(element)) {
			elementSet.remove(element);
		}
	}

	public int size() {
		return elementSet.size();
	}

	public boolean contains(Object o) {
		if(elementSet.contains(o)) return true;
		else return false;
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || this.getClass() != o.getClass()) return false;
		
		Set<?> otherSet = (ArraySet<?>) o;
		if (this.elementSet == otherSet) return true;
		else return false;
	}

	public Set<E> union(Set<E> set) {
		Set<E> unionSet = new ArraySet<E>();
		for(E e: elementSet) {
			unionSet.add(e);
		}
		for(E e: set) {
			unionSet.add(e);
		}
		return unionSet;
	}

	public Set<E> intersection(Set<E> set) {
		Set<E> intersectionSet = new ArraySet<E>();
		for(E e: elementSet) {
			if(set.contains(e)) {
				intersectionSet.add(e);
			}
		}
		return intersectionSet;
	}

	public boolean subset(Set<E> set) {
		for(E e: elementSet) {
			if(!set.contains(e)) {
				return false;
			}
		}
		return true;
	}

	public Iterator<E> iterator() {
		return elementSet.iterator();		
	}

	public String toString() {
		return elementSet.toString();
	}
	
	public void print() {
		Iterator<E> i = this.iterator();
		System.out.print("[ ");
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		} System.out.println("]");
	}
}
