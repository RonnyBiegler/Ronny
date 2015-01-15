import java.util.Scanner;

public class Crypto {

	public static void main(String[] args) {
		
	System.out.println("Bitte Text eingeben");
	Scanner s = new Scanner(System.in);
	Crypto crypto = new Crypto();
	String msg = s.nextLine();
	System.out.println(msg);
	String geheim = crypto.encrypt(msg);
	System.out.println(geheim);
	}
	
	private char[] key; // geheimer Schl�ssel

	// Erzeugt ein Array der L�nge length mit zuf�lligen 
	// Charwerten aus dem Array digits und speichert es
	// im Attribut key
	

	private void generateKey(int length) {

		char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		key = new char [length];
		
		for (int i = 0; i<key.length; i++) {
			key[i] = digits[(int) (Math.random() * digits.length)];
			
		}
		
		
	}
		

	
	
	// Nimmt einen String entgegen und verkn�pft jedes Zeichen des Strings mit
	// dem jeweiligen Wert (Index) im geheimen Schl�ssel �ber ein XOR.
	// Liefert den verschl�sselten Text als String zur�ck.
	public String encrypt(String message) {

		generateKey(message.length());
		int[] geheimeMessage = new int[message.length()];
		String geheimTextString = "";

		for (int i = 0; i < message.length(); i++) {
			geheimeMessage[i] = key[i] ^ message.charAt(i);
			geheimTextString += (char) geheimeMessage[i];
		}

		return geheimTextString;

	}

	
	// Entschl�sselt den �bergebenen String mit Hilfe des geheimen Schl�ssels
	// und gibt den entschl�sselten Text als String zur�ck.
	public String decrypt(String geheimeMessage) {
	
		// todo
		
	}


}
