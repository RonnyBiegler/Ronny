
public class ObjectStack {

private Object[] stack = new Object[0];
	
	
	
	public void push(Object wert){
		
		
		Object[] temp = new Object[stack.length+1];
		
		for (int i = 0; i < stack.length; i++){
			
				temp[i] = stack[i];
				
		}
		
		temp[temp.length -1] = wert;
		stack = temp;
		
		
	}
	
	public Object pop(){
		
		Object temp;
		temp = stack[stack.length -1];
		deleteLast();
		
		return temp; 
	}
	
	public boolean isEmpty(){
		
		return stack.length == 0;		
		
	}
	
	public void deleteLast(){
		Object[] temp = new Object[stack.length -1];
		
		for (int i = 0; i<temp.length; i++){
			temp[i] = stack[i];
		}
		
		stack = temp;
	}
}