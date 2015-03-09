import StackQueue.LinkedStack;
import StackQueue.ArrayedStack;

public class StackClient{

	public static void main(String args[]){

		//LinkedStack<String> stack = new LinkedStack<String>();
		ArrayedStack<String> stack = new ArrayedStack<String>();

		while(!StdIn.isEmpty()){
			
			String s = StdIn.readString();
			if(s.equals("-"))
				System.out.println(stack.pop());
			else
				stack.push(s);
		}	
	}
}
