import java.util.Scanner;


public class Stackmaschine {
	
	Scanner s = new Scanner(System.in);
	
	private Stack temp = new Stack();
	
	
	
 public void Stackmaschine(String eing){
	 
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
		 case 'p':
			 temp.push(Integer.parseInt(eing.substring(i+1,i+5), 16));
			 i=i+4;
		 case 'd':
			 temp.pop();
		 case 'c':
			 a = temp.pop();
			 temp.push(a);
			 temp.push(a);
		 case 's':
			 a = temp.pop();
			 b = temp.pop();
			 temp.push(a);
			 temp.push(b);
		 case 'j':
			 a = temp.pop();
			 b = temp.pop();

			 
			 if (b!=0)i=a;

				 
		 
		 
		 
		 }
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
 }
	
	
	
	
	

}
