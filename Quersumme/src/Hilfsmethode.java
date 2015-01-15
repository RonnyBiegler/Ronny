
public class Hilfsmethode {

	public static void main(String[] args) {
		
		Quersumme qs = new Quersumme();
		System.out.println(qs.quersumme(157));
	
		int [] array = qs.baue(2);
		for (int  i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(qs.toString(qs.baue(4)));
		
		System.out.println(qs.toString(qs.verbinde(qs.baue(4),qs.baue(4))));
		
	}
}
