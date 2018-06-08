package Rectangular;

public class Rectangular {

	public static void main(String[] args) {
		int counter = 0;

		while (counter < 10) {
			System.out.print("-");
			counter++;
		}

		System.out.println("");
		counter = 0;

		while (counter < 5) {
			System.out.println("|        |");
			counter++;
		}

		counter = 0;

		while (counter < 10) {
			System.out.print("-");
			counter++;
		}
	}
}
