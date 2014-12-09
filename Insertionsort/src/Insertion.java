
public class Insertion {

	public static void main(String[] args) {

			int[] bauemeunsortiert = { 4, 1, 13, 45, 134, 8, 2, 5, 7, 222 };
			int[] sortiert = bauemesortiert(bauemeunsortiert);

			for (int i = 0; i < sortiert.length; i++) {
				System.out.print(sortiert[i] + ", ");
			}

		}

		public static int[] bauemesortiert(int[] sortieren) {
			int temp;
			for (int i = 1; i < sortieren.length; i++) {
				temp = sortieren[i];
				int j = i;
				while (j > 0 && sortieren[j - 1] > temp) {
					sortieren[j] = sortieren[j - 1];
					j--;
				}
				sortieren[j] = temp;
			}
			return sortieren;
		
	
	}

}
