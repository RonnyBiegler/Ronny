import java.util.Scanner;


public class Stackmaschine {
	
	Scanner s = new Scanner(System.in);
	
	private Stack temp = new Stack();
	
	
	
 public void maschine(String eing){
	 
	 int a = 0;
	 int b = 0;
	 
	 for(int i=0;i<eing.length();i++) {
		 switch(eing.charAt(i)){
		 
		 case '+':
			 a = temp.pop();
			 b = temp.pop();
			 temp.push(a+b);
			 break;
		 case '-':
			 a = temp.pop();
			 b = temp.pop();
			 temp.push(a-b);
			 break;
		 case '*':
			 a = temp.pop();
			 b = temp.pop();
			 temp.push(a*b);
			 break;
		 case '.':
			 System.out.println((char)temp.pop());
			 break;
		 case 'w':
			 System.out.println(temp.pop());
			 break;
		 case 'r':
			 System.out.println("Bitte die Zeichenfolge eingeben");
			 temp.push(s.nextInt());
			 break;
		 case 'p':
			 temp.push(Integer.parseInt(eing.substring(i+1,i+5), 16));
			 i=i+4;
			 break;
		 case 'd':
			 temp.pop();
			 break;
		 case 'c':
			 a = temp.pop();
			 temp.push(a);
			 temp.push(a);
			 break;
		 case 's':
			 a = temp.pop();
			 b = temp.pop();
			 temp.push(a);
			 temp.push(b);
			 break;
		 case 'j':
			 a = temp.pop();
			 b = temp.pop();
			 if (b!=0)i=a;
			 break;
				 
		 
		 
		 
		 }
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	

}
