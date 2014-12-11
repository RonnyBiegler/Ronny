

public class Arraysort {
	public static void main(String[] args) {
	
	Arraysort as = new Arraysort();
	int[] array = {5,2,3,4,7,6,72,9,10};
	
	
	as.sortiere(array);
	
	
	
	
	
	for (int i=0; i<array.length;i++) {
		System.out.println(array[i]);	
	}
	
	
	}	
	
	
	public void sortiere (int[] array) {				// Zahlen sortieren
		boolean tausch = true;
		for (int j = 1; tausch;j++) {					// Anlegen der Überprüfung ob Tausch stattgefunden hat 
		tausch = false;
			for( int i =0; i<array.length-j;i++) {		// Hilfsvariable zum Taschen, -1 da nicht übers gesamte Array gesucht werden darf, es müssen immer 2 Zahlen miteinander geprüft werden
			if (array[i] > array[i+1]) {				// über generellen Tausch
				int help = array[i];					//1
				array[i] = array[i+1];					//2
				array[i+1] = help;						//3
				tausch = true;
													
				} 
			} 
			
		} 
		
	}
	
	public boolean lexikografisch (String t1, String t2) {				// lexikografisches Sortieren
		String s1 = t1.toUpperCase();
		String s2 = t2.toUpperCase();
		for (int i = 0; i<s1.length() && i<s2.length();i++) 
			if (s1.charAt(i) > s2.charAt(i))	
					return true;
			else if (s1.charAt(i) < s2.charAt(i))
					return false;
		return s1.length() >s2.length();
		
	}
	
	
	

}
