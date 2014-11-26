
public class Hilfsklasse {
	

	private int teiler;

	

	public int quadrieren(int extZahl1) {
		
		return extZahl1*extZahl1;
	}
	
	public double teilen(int extZahl1) {
		double erg = extZahl1/teiler;
		
		return  erg;
			
	}
	
	public void setTeiler(int teiler) {
		this.teiler = teiler;
	}


	public int getTeiler() {
		
		return teiler;
	}
	
	
	
	
	
	

}
