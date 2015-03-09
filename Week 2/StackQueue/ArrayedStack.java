package StackQueue;

public class ArrayedStack<Item>{

	int N = 0;
	private Item[] stack;

	public ArrayedStack(){
		stack = (Item[]) new Object[1];
	}

	public boolean isEmpty(){
		return (N == 0);
	}

	public void push(Item item){
		if(N==stack.length)
			resize(2 * stack.length);
		stack[N++]=item;
	}

	public Item pop(){
		if(!isEmpty()){
			Item item = stack[--N];
			stack[N] = null;
			if((N > 0) && (N == stack.length/4))
				resize((stack.length)/2);
			return (item);
		}
		else
			System.out.println("Stack is Empty");
		return null;
	}

	private void resize(int newCapacity){
		Item[] resized = (Item[]) new Item[newCapacity];
		for(int i = 0; i < N; i++)
			resized[i] = stack[i];
		stack = resized;
	}
}

