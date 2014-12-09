
public class Stack {
	 
	private int[] stack = new int[0];
	
	
	
	public void push(int wert){
		
		
		int[] temp = new int[stack.length+1];
		
		for (int i = 0; i < stack.length; i++){
			
				temp[i] = stack[i];
				
		}
		
		temp[temp.length -1] = wert;
		stack = temp;
		
		
	}
	
	public int pop(){

		int temp;
		temp = stack[stack.length -1];
		deleteLast();
		
		return temp; 
	}
	
	public boolean isEmpty(){
		
		return stack.length == 0;
		
		
	}
	
	public void deleteLast(){
		int[] temp = new int[stack.length -1];
		
		for (int i = 0; i<temp.length; i++){
			temp[i] = stack[i];
		}
		
		stack = temp;
	}

}