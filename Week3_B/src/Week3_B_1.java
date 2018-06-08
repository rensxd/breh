
public class Week3_B_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] getal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int x = 0;

		System.out.println("Im it!");

		while (x < getal.length) {
			if (x == 0) {
				System.out.print(getal[x]);
			} else {
				System.out.print(", " + getal[x]);
			}
			x++;
		}
		System.out.println("");
		System.out.println("Come out, come out, where ever you are!");
	}

}
