public class Auto {
	
	private String farbe;
	private String kennzeichen;
	private double hubraum;
	private int sitzplaetze;
	private String fahrgestellnummer;

	
	
public Auto (String fahrgestellnummer) {
		this.fahrgestellnummer = fahrgestellnummer;
	}
		
public Auto(String farbe, String kennzeichen, double hubraum, int sitzplaetze, String fahrgestellnummer) {
	this(fahrgestellnummer);
	this.farbe = farbe;
	this.kennzeichen = kennzeichen;
	this.hubraum = hubraum;
	this.sitzplaetze = sitzplaetze;
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

	
public void sortiere (Auto[] array) {				
	boolean tausch = true;
	for (int j = 1; tausch;j++) {					
	tausch = false;																									// Mit compareTo
		for( int i =0; i<array.length-j;i++) {	
		if (lexikografisch (array[i].getKennzeichen(), array[i+1].getKennzeichen())) {		// if(array[i].getKennzeichen().compareTo(array[i+1].getkennzeichen()>0)  {		
			Auto help = array[i];					
			array[i] = array[i+1];					
			array[i+1] = help;						
			tausch = true;
												
			} 
		} 
		
	} 
	
}
	
	
	public String toString() {
		return kennzeichen;
	}
	
	

	public String getFarbe() {
		return farbe;
	}

	public String getFahrgestellnummer() {
		return fahrgestellnummer;
	}



	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public double getHubraum() {
		return hubraum;
	}

	public void setHubraum(double hubraum) {
		this.hubraum = hubraum;
	}

	public int getSitzplaetze() {
		return sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}

	
	
	
	

}
