public class Quicksort {

	public static void main(String[] args) {

		String s = "UBPGATNS";

		char[] array = { 'U', 'B', 'P', 'G', 'A', 'T', 'N', 'S' };
		char[] array1 = { 'R', 'B', 'F', 'G', 'Q', 'T', 'N', 'S' };

		System.out.println(quicksort(s));
		System.out.println(quicksort(array));
		
		quicksort(array1, 0, array1.length-1);
		for( char i: array1){
			System.out.print(i);
		}
	}

	// String Sortieren Quicksort String //
	public static String quicksort(String s) {
		if (s.length() < 2)
			return s;
		char pivot = s.charAt(0);
		String links = "";
		String rechts = "";
		for (int i = 1; i < s.length(); i++)
			if (s.charAt(i) > pivot)
				rechts += s.charAt(i);
			else
				links += s.charAt(i);

		return quicksort(links) + pivot + quicksort(rechts);

	}

	// Sortieren Quicksort im Char Array //
	public static char[] quicksort(char[] array) {
		char pivot = array[0];
		char[] blau = new char[array.length];
		int links = 0;
		int rechts = blau.length - 1;
		for (int i = 1; links < rechts; i++) {
			if (array[i] > pivot)
				blau[rechts--] = array[i]; 		// füge größeren Wert an rechte
												// Stelle im Array und counter -1
			else
				blau[links++] = array[i]; 	// füge kleineren Wert an linke Stelle
															// im Array und counter +1
			blau[links] = pivot;}
			if (links > 1) {
				char[] l = new char[links]; 				// Teilarray Links erstellen
				for (int j = 0; j < links; j++)
					l[j] = blau[j];
				l = quicksort(l);
				for (int j = 0; j < links; j++)
					blau[j] = l[j];
			}
			if (rechts < blau.length - 2) {
				rechts++;
				char[] r = new char[blau.length - rechts]; // Teilarray Rechts
															// erstellen
				for (int j = rechts; j < blau.length; j++)
					r[j - rechts] = blau[j];

				r = quicksort(r);
				for (int j = rechts; j < blau.length; j++)
					blau[j] = r[j - rechts];

			}
		
		return blau;
	}
	
			// Quicksort schnell //
	
	public static void quicksort(char[]array1, int l, int r){
		int i = l;
		int j = r;
		char pivot = array1[(l+r)/2];
		while(i<=j){
			while(array1[i]<pivot) i++;
			while(array1[j]>pivot) j--;
			if(i<=j){
				char help = array1[i];
				array1[i] = array1[j];
				array1[j] = help;
				i++;
				j--;
			}
		}
		
		if(j>l) quicksort(array1,l,j);
		if(i<r) quicksort(array1,i,r);
	}

}
