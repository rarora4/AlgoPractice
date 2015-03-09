package StackQueue;

public class FixedCapacityStack{

	int N = 0;
	private Object[] stack;

	public FixedCapacityStack(){
		stack = new Object[1];
	}

	public boolean isEmpty(){
		return (N == 0);
	}

	public void push(Object item){
		if(N==stack.length)
			resize(2 * stack.length);
		stack[N++]=item;
	}

	public Object pop(){
		if(!isEmpty()){
			Object item = stack[--N];
			stack[N] = null;
			if((N > 0) && (N == stack.length/4))
				resize((stack.length)/2);
			return (item);
		}
		else
			System.out.println("Stack is Empty");
		return "";
	}

	private void resize(int newCapacity){
		Object[] resized = new Object[newCapacity];
		for(int i = 0; i < N; i++)
			resized[i] = stack[i];
		stack = resized;
	}
}

