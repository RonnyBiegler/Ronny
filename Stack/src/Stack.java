
public class Stack {
	
	
	private int []array1 = new int[0];


	public void push(int a){
		
	int []array2 = new int[array1.length+1];	
	
	for (int i=0;i<array1.length;i++) {
		array2[i+1]=array1[i];
	}
		array2[0]=a;
	
		array1=array2;
	}
	
	public int pop(){
	int[]array2 = new int[array1.length-1];
	int tmp=array1[0];
	
	for (int i=0;i<array2.length;i++){
		array2[i]=array1[i+1];
		
		
	}
		array1=array2;
		return tmp;
	}
	
	
	public boolean isEmpty() {
		
		return array1.length==0;
	}
	
	
	
	
	
}
