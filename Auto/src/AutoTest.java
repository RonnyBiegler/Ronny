
public class AutoTest {

	public static void main(String[] args) {
		
		Autohaus a = new Autohaus();
		a.fuellen(1000);
		a.entferne("rot");
		a.entferne("blau");
		
		System.out.println("Aus 1000 Autos im Autohaus gibt es....");
		System.out.println(a.zaehle("blau")+" blaue Autos");
		System.out.println(a.zaehle("weiﬂ")+" weiﬂe Autos");
		System.out.println(a.zaehle("rot")+" rote Autos");
		System.out.println(a.zaehle("gruen")+" gruene Autos");
		System.out.println(a.zaehle("schwarz")+" schwarze Autos");
		
		
		
		
	}

}
