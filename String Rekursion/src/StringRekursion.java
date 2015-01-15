
public class StringRekursion {

	public static void main(String[] args) {
	
		System.out.println(umdrehen("ABCDEFGH"));
	}
	
	public static String umdrehen(String text ){
		if(text.length()>1)
		return umdrehen(text.substring(1)) + text.charAt(0);
		
		return text;
	}
		
	
	

}
