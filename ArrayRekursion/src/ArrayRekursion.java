
public class ArrayRekursion {

	
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,7,6,72,9,10};	
		array1 = drehen(array1, 0);
		for(int i: array1)
			System.out.println(i);
		
		int[] array2 = {1,2,3,4,7,6,72,9,10};	
		array2 = drehen2(array2, 0);
		for(int i: array2)
			System.out.println(i);
		
		
		
	}
	
	public static int[] drehen(int[]array, int pos){
	
	if(pos>=array.length) return new int[array.length]; // Abbruchbedingung
		
	int[] arrayBlau = drehen(array,pos+1);	// durchzählen auf Hinweg
	
	arrayBlau[array.length-1-pos]=array[pos];	// Rückweg
	
	return arrayBlau;						// Rückweg
	
	}
	
	public static int[] drehen2(int[]array,int pos){
		
		if(pos>=array.length) return new int[array.length];
		
		int apfel = array[pos];
		
		drehen(array,pos+1);
		
		array[array.length-1-pos]=apfel;
		
		return array;
		
	}
	

}
