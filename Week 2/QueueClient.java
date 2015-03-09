import StackQueue.LinkedQueue;
import StackQueue.ArrayedQueue;

public class QueueClient{

	public static void main(String args[]){

		//LinkedQueue<String> queue = new LinkedQueue<String>();
		ArrayedQueue<String> queue = new ArrayedQueue<String>();

		while(!StdIn.isEmpty()){
			
			String s = StdIn.readString();
			if(s.equals("-"))
				System.out.println(queue.dequeue());
			else
				queue.enqueue(s);
		}	
	}
}
