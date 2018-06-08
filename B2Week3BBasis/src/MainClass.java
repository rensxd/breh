
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

//		Scanner reader = new Scanner(System.in);
//		Random random = new Random();
//
//		System.out.println("Kies een getal tussen de 2 en 9:");
//		int n = reader.nextInt();
//
//		if (n > 1 && n < 10) {
//			for (int b = 0; b < n; b++) {
//				int i = random.nextInt(100) + 0;
//				System.out.println(b+1 + ": Getal nummer:" + " " + i);
//			}
//		} else {
//			System.out.println("Kies een getal tussen de 2 en de 9 aub. Het vorig getal voldoet er niet aan");
//		}
		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Kies twee getallen tussen de 5 en de 9. Het tweede getal moet groter zijn dan het eerste getal");
		int y = reader.nextInt();
		int x = reader.nextInt();

		if (y < x) {
			if (y > 4 && x < 10) {
				int a = y + (int) (Math.random() * (x - y + 1));
				int[] iets = new int[a];
				for (int b = 0; b < a; b++) {
					int d = y + (int) (Math.random() * (x - y + 1));
					iets[b] = d;
					System.out.println("B: " + (b + 1) + " D: " + d);
				}
			} else {
				System.out.println("Kies een getal tussen de 5 en de 9");
			}
		}
		else {
			System.out.println("Het tweede getal moet groter zijn dan het eerste");
		}	
	}
}
