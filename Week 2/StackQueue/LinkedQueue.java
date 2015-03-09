package StackQueue;

public class LinkedQueue{

	private Node first, last;

	private class Node{
		Object item;
		Node next;
	}

	public boolean isEmpty(){
		return (first == null);
	}

	public void enqueue(Object item){
		Node oldNode = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty())
			first = last;
		else
			oldNode.next = last;
	}

	public Object dequeue(){
		Object item = first.item;
		first = first.next;
		if(isEmpty())
			last = null;
		return item;
	}
}
