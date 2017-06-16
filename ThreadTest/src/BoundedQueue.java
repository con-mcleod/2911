import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//import sun.misc.Lock;

// https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/locks/Condition.html
/** 
    A first-in, first-out bounded collection of objects. 
 */ 
public class BoundedQueue<E> { 

	private Object[] elements; 
	private int head; 
	private int tail; 
	private int size;
	private boolean debug;
	
	private final ReentrantLock l = new ReentrantLock();
	private Condition fullCondition = l.newCondition();
	private Condition emptyCondition = l.newCondition();

	
	/** 
       Constructs an empty queue. 
       @param capacity the maximum capacity of the queue 
	 */ 
	public BoundedQueue(int capacity) { 
		elements = new Object[capacity]; 
		head = 0; 
		tail = 0; 
		size = 0;
	} 

	/** 
       Removes the object at the head. 
       @return the object that has been removed from the queue
       @precondition !isEmpty()
	 */ 
	public E remove() throws InterruptedException { 
		E r;
		l.lock();

		try {
			
			while (isEmpty()) {
				try {
					emptyCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			r = (E) elements[head]; 
			head++;
			size--;

			if (head == elements.length) {
				head = 0; 
			}

			fullCondition.signal();

		} finally {
			l.unlock();
		}

		return r; 
	} 

	/** 
       Appends an object at the tail. 
       @param newValue the object to be appended 
       @precondition !isFull();
	 */ 
	public void add(E newValue) { 

		l.lock();
		
		try {
			
			while (isFull()) {
				try {
					fullCondition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			elements[tail] = newValue; 
			tail++;
			size++;

			if (tail == elements.length) {
				tail = 0; 
			}
			
			emptyCondition.signal();

		} finally {
			l.unlock();
		}
	} 

	public boolean isFull() { 
		return size == elements.length;
	} 

	public boolean isEmpty() { 
		return size == 0; 
	} 

	public void setDebug(boolean newValue) {
		debug = newValue;
	}
}