

public class Quersumme {


	
	public int quersumme (int zahl) {
		String s = ""+ zahl;
		int erg = 0;
		    for (int  i=0; i<s.length(); i++) {
		        erg = erg + s.charAt(i) - '0';
		    }
		    return erg;		    
	}
	
	public int[] baue (int zahl2) {
		
	int [] erg = new int[zahl2];
	
	for (int  i=0; i<erg.length; i++) {
        erg[i] = (int)(Math.random() * 100);
	
		}
	
	  return erg;
	}
		   	
	public String toString(int[] arr) {
		String s = "[";
		
		for (int i=0;i<arr.length;i++) {
			if(i==arr.length-1)	
			s += arr[i];
			else
				s += arr[i]+",";
			
				}
		return s.substring(0,s.length()-1)+"]";
			
	}
	
	public int [] verbinde (int[] ar1, int[] ar2) {
		
		int[] erg = new int[ar1.length+ar2.length];
		
		for (int i=0;i<ar1.length; i++)
			erg[i] = ar1[i];
			
		for (int j=0;j<ar2.length; j++)
			erg[j] = ar2[j];	
			
			
		
		
		return erg;
	}
		
		
		
		
		
	}

