
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] getals = new int[20];

		int counter = 0;
		int bert = 1;
		System.out.print(counter + " " + bert + " ");
		int i = 2;
		int x = 0;

		while (i < getals.length) {
			bert = bert + getals[x];
			i++;
			
			
			int ernie;
			ernie = counter + bert;
			System.out.print(ernie + " ");
			counter = bert;
			bert = ernie;
		}

		// String[] adjectives = {"Incredible", "Mighty", "Black", "Iron", "Hawk"};
		// String[] names = { " Hulk", " Thor", " Widow", " Man", "eye"};
		//
		// int x = 0;
		//
		// System.out.println("Assemble the Avengers!");
		//
		// while (x < adjectives.length) {
		// System.out.println(" " + adjectives[x] + names[x]);
		// x++;
		// }

		// double[] getallen = { 1, 3, 5, 7, 9, 11 };
		//
		// double counter = 0;
		// int x = 0;
		//
		// while (x < getallen.length) {
		// counter = counter + getallen[x];
		//
		// x++;
		// }
		//
		// double average = counter / getallen.length;
		// System.out.println("Het gemiddelde is : " + average);
		//
	}

}
