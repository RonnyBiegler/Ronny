
public class CharStack {
	
private char[] stack = new char[0];
	
	
	
	public void push(char wert){
		
		
		char[] temp = new char[stack.length+1];
		
		for (int i = 0; i < stack.length; i++){
			
				temp[i] = stack[i];
				
		}
		
		temp[temp.length -1] = wert;
		stack = temp;
		
		
	}
	
	public int pop(){
		
		char temp;
		temp = stack[stack.length -1];
		deleteLast();
		
		return temp; 
	}
	
	public boolean isEmpty(){
		
		return stack.length == 0;
		
		
	}
	
	public void deleteLast(){
		char[] temp = new char[stack.length -1];
		
		for (int i = 0; i<temp.length; i++){
			temp[i] = stack[i];
		}
		
		stack = temp;
	}

}