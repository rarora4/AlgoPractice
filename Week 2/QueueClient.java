import StackQueue.LinkedQueue;

public class QueueClient{

	public static void main(String args[]){

		LinkedQueue queue = new LinkedQueue();
		//FixedCapacityStack stack = new FixedCapacityStack();

		while(!StdIn.isEmpty()){
			
			String s = StdIn.readString();
			if(s.equals("-"))
				System.out.println(queue.dequeue());
			else
				queue.enqueue(s);
		}	
	}
}
