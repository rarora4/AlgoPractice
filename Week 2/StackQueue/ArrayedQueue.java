package StackQueue;

public class ArrayedQueue{

	int head=0, tail=0;
	private Object[] queue;

	public ArrayedQueue(){
		queue = new Object[1];
	}

	public boolean isEmpty(){
		return (queue[head]==null);
	}

	public void enqueue(Object item){
		if(tail==queue.length)
			resize(2 * queue.length);
		queue[tail++]=item;
		System.out.println("head: "+ head + " tail: " + tail);
	}

	public Object dequeue(){
		if(!isEmpty()){
			Object item = queue[head++];
			queue[head-1] = null;
			if(((tail-head) >= 0) && ((tail-head) == queue.length/4))
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
		for(int i = head; i < tail; i++)
			if(queue[i] != null)
				resized[k++] = queue[i];
		if(newCapacity < queue.length){
			tail = k;
			head = 0;
		}
		queue = resized;
	}
}
