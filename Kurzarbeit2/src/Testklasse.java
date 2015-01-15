
public class Testklasse {

	public static void main(String[] args) {
		
		//Farbe farbe = new Farbe();
		
		
		
		
		
		String[][] daten = 	{{"blau","ABS S 123","4.2","1","XXXX234232XXXXX"},																				//Array Daten anlegen und befüllen
							{"rot","LL LL 133","2.4","2","YYYYYY23526YYYY"},
							{"silber","B CD 99","6.8","4","ZZZZZ45644ZZZZZZ"},
							{"schwarz","Se X 69","1.2","2","CCCC32425CCCCCCCC"},
							{"weiss","OA XX 69","3.0","5","AAAAAAgfd433AAAAAA"}};

		
		Auto[] autos = new Auto[daten.length];																											// Neues Array anlegen mit der Länge von daten.length
		
		for (int i=0; i<autos.length;i++) {
			autos [i] = new Auto(daten[i][0], daten[i][1], Double.parseDouble (daten[i][2]), Integer.parseInt (daten[i][3]), daten[i][4]); 				// Konstruktormethode aufrufen und mitteilen was sich an
																															 							// der jeweiligen Stelle für ein Datentyp verbirgt
		}
	
			
	
		int i =1;
		for (Auto a:autos) {
			
			System.out.println("Auto"+ (i++)  +" "+ a.getFarbe()+" " + a.getHubraum()+" " + a.getKennzeichen()+" " + a.getSitzplaetze() +" " +a.getFahrgestellnummer());				
			
		
		a.sortiere(autos);		
		System.out.println(a.getKennzeichen());
			
			
		}
		

	}

}
