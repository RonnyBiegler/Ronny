
public class Neueklasse extends Hilfsklasse {

	private int[][] zufall ;
	
	
	
	public void arrfuell (int a,int b) {
		zufall = new int [a][b];
		
		for (int i = 0; i<a; i++) {
			
			for (int j =0; j<b; j++){
				zufall [i] [j] = (int) (Math.random()*100);
				
			}
		}
	
	}
	
	public String [] ausg() {
		String [] ausg = new String[zufall.length];
		for (int i = 0; i<ausg.length;i++) {
			ausg[i]="Zeile"+(i+1)+": ";
			for (int j =0; j<zufall[i].length;j++ ) {
				
	
				
	
		if (j==zufall[i].length-1){
			ausg [i] += zufall[i][j];
			
		}
		else {
			ausg [i] += zufall[i][j] +",";
		}
		
		
		}
		
		
	}
		return ausg;
	

	
	
	
	
	
	
	
	}
	
}