
public class TestRekursion {

	public static void main(String[] args) {
		
		runterzaehlen(7);

	}
	
	public static void runterzaehlen(int zahl){
		System.out.println(zahl);
		if(zahl > 0)
			runterzaehlen(zahl-1);
		//System.out.println(zahl);
		
	}
}
