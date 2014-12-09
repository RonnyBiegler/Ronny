

public class Arraysort {
	public static void main(String[] args) {
		
	
	
	}	
	
	int[] array = {5,2,3,4,7,6,72,9,10};
	public void sortiere (int[] array) {
		boolean tausch = true;
		while (tausch) {								// Anlegen der Überprüfung ob Tausch stattgefunden hat 
		tausch = false;
			for( int i =0; i<array.length-1;i++) {		// Hilfsvariable zum Taschen, -1 da nicht übers gesamte Array gesucht werden darf, es müssen immer 2 Zahlen miteinander geprüft werden
			if (array[i] > array[i+1]) {				// über generellen Tausch
				int help = array[i];					//1
				array[i] = array[i+1];					//2
				array[i+1] = help;						//3
				tausch = true;
				
				System.out.println(" "+ array[i]);
				
					
				} 
			} 
			
		} 
		
	}
	
	

}
