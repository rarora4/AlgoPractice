package StackQueue;

public class LinkedStack{

	private Node first = null;

	private class Node{
		Object item;
		Node next;
	}

	public boolean isEmpty(){
		return (first == null);
	}

	public void push(Object item){
		Node oldNode = first;
		first = new Node();
		first.item = item;
		first.next = oldNode;
	}

	public Object pop(){
		Object item = first.item;
		first = first.next;
		return item;
	}
}
