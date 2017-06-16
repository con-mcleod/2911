
public class MessageQueue {

	private Message[] Queue;
	private int size, head, tail;
	private int capacity;
	
	/** Constructor for Message Queue which holds messages
	 * @pre capacity > 0
	 * @post Message Queue is created which holds a maximum of 'capacity' messages
	 * @param capacity = maximum size of Message Queue
	 */
	public MessageQueue(int capacity) {
		this.capacity = capacity;
		Queue = new Message[capacity];
		this.size = 0;
		this.head = 0;
		this.tail = 0;
	}
	
	/** Function to add a message to Message Queue
	 * @pre newMsg is not null, Message Queue exists
	 * @post Message Queue has stored newMsg, wrapped to front of Queue if size is larger than capacity,
	 * 		and size is larger by 1 if size is smaller than capacity
	 * @param newMsg = new message to be stored in Message Queue
	 */
	public void addMsg(Message newMsg) {
		Queue[tail] = newMsg;
		if (size < capacity) {
			size += 1;
		}
		tail = (tail+1) % capacity;
		if (size == capacity) {
			head = (tail % capacity);
		}
	}
	
	/** Function to remove the first message in the Message Queue
	 * @pre Message Queue is not empty
	 * @post Message Queue has removed first message in Queue, size is smaller by 1
	 */
	public void removeMsg() {
		Queue[head] = null;
		size -= 1;
		head = (head+1) % capacity;
	}
	
	public Message getMsg(int index) {
		return Queue[index];		
	}
	
	public void printQueueState() {
		System.out.println("Size: " + size + "; Head: " + head + "; Tail: " + tail);
	}
	
	public void printMsgQueue() {
		System.out.print("[ ");
		for ( int index = head; index<(size + head); index++ ) {
			System.out.print(getMsg(index).getContents() + " ");
		}
		System.out.println(" ]");
	}
	
	public int getQueueCapacity() {
		return this.capacity;
	}
}

