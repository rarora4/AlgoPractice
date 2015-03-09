package StackQueue;

public class ArrayedQueue{

	int N=0;
	int head=0, tail=0;
	private Object[] queue;

	public ArrayedQueue(){
		queue = new Object[1];
	}

	public boolean isEmpty(){
		return (N==0);
	}

	public void enqueue(Object item){
		if(N==queue.length)
			resize(2 * queue.length);
		queue[tail++]=item;
		N++;
		System.out.println("head: "+ head + " tail: " + tail);
	}

	public Object dequeue(){
		if(!isEmpty()){
			Object item = queue[head++];
			queue[head-1] = null;
			N--;
			if((N >= 0) && (N == queue.length/4))
				resize((queue.length)/2);
			System.out.println("HEAD: "+head+" TAIL: "+tail);
			return (item);
		}
		else
			System.out.println("Stack is Empty");
		return "";
	}

	private void resize(int newCapacity){
		Object[] resized = new Object[newCapacity];
		int k=0;
		System.out.println("New Capacity: " + newCapacity);
		for(int i = 0; i < N; i++){
			//if(queue[i] != null)
				resized[i] = queue[i+head];
		}
		tail = N;
		head = 0;
		queue = resized;
	}
}
