package StackQueue;

public class LinkedStack<Item>{

	private Node first = null;

	private class Node{
		Item item;
		Node next;
	}

	public boolean isEmpty(){
		return (first == null);
	}

	public void push(Item item){
		Node oldNode = first;
		first = new Node();
		first.item = item;
		first.next = oldNode;
	}

	public Item pop(){
		Item item = first.item;
		first = first.next;
		return item;
	}
}
