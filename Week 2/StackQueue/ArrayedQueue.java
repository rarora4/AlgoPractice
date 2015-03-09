package StackQueue;

public class ArrayedQueue<Item>{

	int N=0;
	int head=0, tail=0;
	private Item[] queue;

	public ArrayedQueue(){
		queue = (Item[]) new Object[1];
	}

	public boolean isEmpty(){
		return (N==0);
	}

	public void enqueue(Item item){
		if(N==queue.length)
			resize(2 * queue.length);
		queue[tail++]=item;
		N++;
		System.out.println("head: "+ head + " tail: " + tail);
	}

	public Item dequeue(){
		if(!isEmpty()){
			Item item = queue[head++];
			queue[head-1] = null;
			N--;
			if((N >= 0) && (N == queue.length/4))
				resize((queue.length)/2);
			System.out.println("HEAD: "+head+" TAIL: "+tail);
			return (item);
		}
		else
			System.out.println("Stack is Empty");
		return null;
	}

	private void resize(int newCapacity){
		if(newCapacity == 0) newCapacity = 1;
		Item[] resized = (Item[]) new Object[newCapacity];
		System.out.println("New Capacity: " + newCapacity);
		for(int i = 0; i < N; i++)
				resized[i] = queue[i+head];
		tail = N;
		head = 0;
		queue = resized;
	}
}
