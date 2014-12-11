
public class Testmethoden {

	public static void main(String[] args) {
		Hilfmethoden hm = new Hilfmethoden();
			int [] array = {1,2,3,4,5,6};
			System.out.println(hm.vergleichen("Hallo","Hallo") + "\n");
			System.out.println(hm.summe(array) + "\n"); 
			System.out.println(hm.schnitt(array));
	}

}
