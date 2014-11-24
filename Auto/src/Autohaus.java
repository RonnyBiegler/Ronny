
public class Autohaus {
	
	private Auto []  autos;
	
	
	
	public void fuellen() {
		autos = new Auto[100];
		String farben [] = {"weiﬂ", "rot","blau","gruen","schwarz"};
	
		for(int i =0; i<100; i++) {
			Auto auto = new Auto();
			
			auto.setFarbe (farben[(int) (Math.random() *5)]);
			autos[i] = auto;
		
		}
	}
		
	public int zaehle(String farbe) {
		int zaehler = 0;
		for (int i =0; i<autos.length;i++)
			if (autos[i].getFarbe().equals(farbe))
					zaehler ++;
	
		return zaehler;
	}
	
	
	
	
		
}
	
	
	
	
	


