
public class Start {

	
	public static void main(String[] args) {
		
		Hilfsklasse hk = new Hilfsklasse();
		Neueklasse nk = new Neueklasse();
		
		hk.setTeiler(5);
		
	
		
		System.out.println("Der Inhalt der Teilers ist " + hk.getTeiler());
		
	
		
		
		nk.arrfuell(4, 4);
		String[] Ausgabe =nk.ausg();
		
		for (int i=0;i<Ausgabe.length; i++) {
			System.out.println(Ausgabe[i]);
		}
		
		
	}

}
