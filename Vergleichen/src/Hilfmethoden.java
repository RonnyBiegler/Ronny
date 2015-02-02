import java.util.Scanner;

public class Hilfmethoden {

	public boolean vergleichen(String s1, String s2) {
		
		if (s1.length() != s2.length()) return false;
		
			for (int i=0; i<s1.length(); i++) 
				if(s1.charAt(i) != s2.charAt(i)) return false;
				
			
					return true;

													}
	
	public int summe (int[] array) {
		int summe = 0;
		
		for (int a:array) 
			
		//summe +=a;
			summe=summe+a;
		return summe;
		
		
									}
		
	
	public double schnitt (int[] array) {
		double ergebnis =0;
		for (int a:array)
			
			ergebnis +=a;
			//schnitt = schnitt +a;
				
			return ergebnis/array.length;
	}
			
	public double nullstelleneingabe() {
	
	Scanner se = new Scanner(System.in);
			System.out.println("Nullstellenberechnung");
			System.out.println("Geben Sie p ein");
			double p = se.nextDouble();
			System.out.println("Geben Sie q ein");
			double q = se.nextDouble();
			double [] erg = hm.nullstellen (p,q);
			if (erg==null)
			else if (erg.length ==1)
			else for (int=0; i<2; i++)
			
			
	public double[] nullstellen (double p, double q) {
		
			
			double inwurzel = (p/2)*(p/2)-q;
			if (inwurzel < 0) return null;
				
			if (inwurzel == 0) 
			return new double[] { -p/2 };
			
			double wurzel = Math.sqrt(inwurzel);
			return new double[] {
			(-p/2)+ wurzel, (-p/2) - wurzel };
						
				}
			
	}
}