
public class Array {

	public static void main(String[] args) {
		
	
		
		String [] buchstA = {"a","b","c","d","e"};
		String [] buchstX = {"x","y","z"};
		int zahl = 0;
		
		String [] [] buchstAX = new String [buchstA.length] [buchstX.length];
		
		for (int a = 0; a<buchstA.length; a++) {
		
			for (int x= 0; x < buchstX.length;x++) {
				buchstAX [a] [x] = buchstA[a] + buchstX[x] + "_" + zahl++;
				
				System.out.print(buchstAX[a][x] + "\t");		
				
			  }
			System.out.println();
		   }
	  }
}
