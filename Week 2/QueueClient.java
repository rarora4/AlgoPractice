import StackQueue.LinkedQueue;
import StackQueue.ArrayedQueue;

public class QueueClient{

	public static void main(String args[]){

		//LinkedQueue queue = new LinkedQueue();
		ArrayedQueue queue = new ArrayedQueue();

		while(!StdIn.isEmpty()){
			
			String s = StdIn.readString();
			if(s.equals("-"))
				System.out.println(queue.dequeue());
			else
				queue.enqueue(s);
		}	
	}
}
