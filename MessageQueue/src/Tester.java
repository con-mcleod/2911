
public class Tester {
	
	public static void main(String[] args) {
			
		System.out.println("Performing Test");
		
		MessageQueue queue = new MessageQueue(6);
		queue.addMsg(new Message("Message 1"));
		queue.printQueueState();
		queue.printMsgQueue();
		
		queue.addMsg(new Message("Message 2"));
		queue.printQueueState();
		queue.printMsgQueue();
		
		queue.addMsg(new Message("Message 3"));
		queue.printQueueState();
		queue.printMsgQueue();
		
		queue.addMsg(new Message("Message 4"));
		queue.printQueueState();
		queue.printMsgQueue();
		
		queue.addMsg(new Message("Message 5"));
		queue.printQueueState();
		queue.printMsgQueue();
		
		queue.removeMsg();
		queue.printQueueState();
		queue.printMsgQueue();
		
		queue.removeMsg();
		queue.printQueueState();
		queue.printMsgQueue();
		
		queue.addMsg(new Message("Message 6"));
		queue.printQueueState();
		queue.printMsgQueue();
		
		queue.addMsg(new Message("Message 7"));
		queue.printQueueState();
		
		queue.addMsg(new Message("Message 8"));
		queue.printQueueState();
		
		queue.addMsg(new Message("Message 9"));
		queue.printQueueState();
		
		queue.addMsg(new Message("Message 10"));
		queue.printQueueState();
		
		queue.addMsg(new Message("Message 11"));
		queue.printQueueState();
	}

}
