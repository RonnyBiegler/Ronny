public class Primzahlen {

	public static void main(String[] args) {

		Primzahlen pz = new Primzahlen();

		pz.sieben();
	}

	public void sieben() {

		int[] primarray = new int[9000];

		for (int i = 0; i < primarray.length; i++) {
			primarray[i] = i + 2;

		}

		for (int i = 0; i < primarray.length; i++) {
			if (primarray[i] != 0) {
				for (int k = primarray[i] + i; k < primarray.length; k += primarray[i]) {
					primarray[k] = 0;

				}
			}
		}
		int zaehler = 0;
		for (int x = 0; x < primarray.length; x++) {
			if (primarray[x] != 0) {
				zaehler++;
			}

		}

		int[] realprim = new int[zaehler];

		zaehler = 0;
		for (int x = 0; x < primarray.length; x++) {

			if (primarray[x] != 0) {
				realprim[zaehler] = primarray[x];
				zaehler++;
			}

		}
		System.out.println("Die Anzahl der Primzahlen bis 9000 beträgt " +zaehler);

	}
}
