
public class Hilfmethoden {

	public boolean vergleichen(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return false;
		}
			for (int i=0; i<s1.length(); i++) {
				if(s1.charAt(i) != s2.charAt(i)) {
					return false;
				}
			}
			
					return true;
									
	}
	
	public int summe (int[] array) {
		int summe = 0;
		
		for (int a:array) 
			
		//summe +=a;
			summe=summe+a;
		
		
		return summe;
	}		
}