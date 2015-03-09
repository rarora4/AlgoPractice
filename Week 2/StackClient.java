import StackQueue.LinkedStack;
import StackQueue.FixedCapacityStack;

public class StackClient{

	public static void main(String args[]){

		//LinkedStack stack = new LinkedStack();
		FixedCapacityStack stack = new FixedCapacityStack();

		while(!StdIn.isEmpty()){
			
			String s = StdIn.readString();
			if(s.equals("-"))
				System.out.println(stack.pop());
			else
				stack.push(s);
		}	
	}
}
