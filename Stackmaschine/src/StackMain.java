public class StackMain {

	public static void main(String[] args) {
		CharStack myCStack = new CharStack();
				
					myCStack.push('a');
					myCStack.push('b');
					myCStack.push('c');
					
					while (!myCStack.isEmpty())
						System.out.println((char)(myCStack.pop()));
					
					
		CharStackString myCSStack = new CharStackString();
					
					myCSStack.push('a');
					myCSStack.push('b');
					myCSStack.push('c');
					
					while (!myCSStack.isEmpty())
						System.out.println((char)(myCSStack.pop()));
									
		Stack myStack = new Stack();
		
			myStack.push(1);
			myStack.push(2);
			myStack.push(3);
			
			while (!myStack.isEmpty())
				System.out.println(myStack.pop());
		
		ObjectStack  myOStack = new ObjectStack();
		
			myOStack.push(new Object());
			myOStack.push(new Object());
			myOStack.push(new Object());
			
			while (!myOStack.isEmpty())
				System.out.println(myOStack.pop());
		
			
			
		
		
	}

}