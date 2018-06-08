import java.util.HashMap;

public class MineField {

	// variabele //
	
	private HashMap<String, Square> vakjes;
	private int aantalVakjes;

	MineField() {
		
		// initialized //
		
		setVakjes(new HashMap<String, Square>());
	}

	void makeField() {
		
		// grid vullen aan de hand van de userinput //

		for (int i = 0; i < aantalVakjes; i++) {
			for (int j = 1; j <= aantalVakjes; j++) {
				String key = "" + ((char) ('a' + i)) + j;
				getVakjes().put(key, new Square());
			}
		}
		System.out.println("DEBUG " + getVakjes().keySet());

	}

	void printlowerAxis() {
		
		// print onderkant //
		
		System.out.print(" ");
		char a = 'A';
		for (int i = 0; i < aantalVakjes; i++) {
			System.out.print(" " + a);
			a++;
		}
		System.out.println("");
	}

	// void printsideAxis() {
	// int o = aantalVakjes;
	// int[] b = new int[o];
	// int index = 0;
	// while (index < b.length) {
	// b[index] = o;
	// System.out.println(b[index]);
	//
	// index++;
	// o--;
	// }
	// }

	public void setVeldGrootte(int veldGrootte) {
		this.aantalVakjes = veldGrootte;

	}

	public int getVeldGrootte() {
		return aantalVakjes;
	}

	public void print() {
		
		// print het grid //
		
		char a = 'a';
		for (int y = 0; y < aantalVakjes; y++) {
			System.out.println(" ");
			System.out.print((aantalVakjes - y));
			for (int x = 0; x < aantalVakjes; x++) {
				if (getVakjes().get(("" + a + (aantalVakjes - y))) != null){
//					System.out.print(" .");
					if (getVakjes().get(("" + a + (aantalVakjes - y))).isMarked() && !getVakjes().get(("" + a + (aantalVakjes - y))).isBomb()) {
						System.out.println( " *");
					}
					if (!getVakjes().get(("" + a + (aantalVakjes - y))).isMarked() && getVakjes().get(("" + a + (aantalVakjes - y))).isTested()) {
						System.out.println("DEBUGG: laat zien hoeveel bommen er omheen liggen");
					}
				}
			}
			
				}
		a++;
		
		System.out.println("");
		this.printlowerAxis();

		if (MainClass.CHEAT) {

		}

	}

	public HashMap<String, Square> getVakjes() {
		return vakjes;
	}

	public void setVakjes(HashMap<String, Square> vakjes) {
		this.vakjes = vakjes;
	}

}
