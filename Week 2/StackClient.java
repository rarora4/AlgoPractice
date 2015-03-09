import StackQueue.LinkedStack;
import StackQueue.ArrayedStack;

public class StackClient{

	public static void main(String args[]){

		//LinkedStack stack = new LinkedStack();
		ArrayedStack stack = new ArrayedStack();

		while(!StdIn.isEmpty()){
			
			String s = StdIn.readString();
			if(s.equals("-"))
				System.out.println(stack.pop());
			else
				stack.push(s);
		}	
	}
}
