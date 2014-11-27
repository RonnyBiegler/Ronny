public class Autohaus {

	private Auto[] autos;

	public void fuellen(int anzahl) {
		autos = new Auto[anzahl];
		String farben[] = { "weiﬂ", "rot", "blau", "gruen", "schwarz" };

		for (int i = 0; i < anzahl; i++) {
			Auto auto = new Auto();
			auto.setFarbe(farben[(int) (Math.random() * 5)]);
			autos[i] = auto;

		}
	}

	public int zaehle(String farbe) {
		int zaehler = 0;
		for (int i = 0; i < autos.length; i++)
			if ((autos[i] != null) && autos[i].getFarbe() != null
					&& autos[i].getFarbe().equals(farbe))
				zaehler++;

		return zaehler;
	}

	public void entferne(String farbe) {
		int zaehler = 0;
		for (int i = 0; i < autos.length; i++) {
			if (autos[i].getFarbe().equals(farbe)){
				autos[i] = null;
				zaehler++;}
		}

	
		
		Auto[] parkplatz = new Auto[autos.length-zaehler];
		zaehler = 0;
		for (int i = 0, j = 0; i < autos.length; i++) {
			if (autos[i] != null)
				parkplatz[j++] = autos[i];

			

		}
		autos = parkplatz;
	}
}
