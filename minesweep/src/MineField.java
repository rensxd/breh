import java.util.HashMap;

public class MineField {

	// variables //
	
	private HashMap<String, Square> squares;
	private int size;

	MineField() {
		
		// initialize //
		squares = new HashMap<String, Square>();
	}

	public void makeField(int size, int bombChance) {
		
		// grid vullen aan de hand van de userinput //
		this.size = size;
		
		for (char x = 'A' ; x < ('A' + size); x++) {
			for (int y = 1; y <= size; y++) {
				String key = createKey(x, y);
				//TODO make some squares bombs by giving bombchance
				squares.put(key, new Square());
			}
		}
		
		//TODO check if this is at least one bomb, if not make a random square a bomb
		for (String key : squares.keySet()) {
		    //TODO
		}
		
		//TODO fill for every field how many bombs are around it
		for (char x = 'A' ; x < ('A' + size); x++) {
			for (int y = 1; y <= size; y++) {
				String key = createKey(x, y);
				int nrBombsAround = calculateNrBombsAround(x, y);
				squares.get(key).setNrOfBombsAround(nrBombsAround);
			}
		}
	}
	
	private int calculateNrBombsAround(char x, int y) {
		int nrBombs = 0;
		String key = "";
		
		//TODO
		
		key = createKey((char)(x - 1), y);
		if (isBomb(key))
			nrBombs++;
		
		key = createKey((char)(x + 1), y);
		if (isBomb(key))
			nrBombs++;
		
		return nrBombs;
	}
	
	private boolean isBomb(String key) {
		return squares.containsKey(key) && squares.get(key).isBomb();
	}
	

	public int getSize() {
		return size;
	}

	public void print() {
		// print the grid //
		for (int y = 0; y < size; y++) {
			System.out.println(" ");
			int index = size - y;
			printSideAxisIndex(index);
			printRowOfSquares(index);
		}
		System.out.println("");
		printlowerAxis();

		if (Main.CHEAT) {

		}

	}
	
	private String createKey(char letter, int number) {
		return "" + letter + number;
	}
	
	private void printSideAxisIndex(int index) {
		if (index < 10) {
			System.out.print(" ");
		}
		System.out.print(index);
	}
	
	private void printRowOfSquares(int number) {
		for (char c = 'A' ; c < ('A' + size); c++) {
			Square square = squares.get(createKey(c, number));
			if (square != null) {
				if (!square.isMarked() && !square.isTested()) {
					System.out.print(" .");
				}
				if (square.isMarked() && !square.isTested()) {
					System.out.print(" *");
				}
				if (!square.isMarked() && square.isTested()) {
					System.out.print(" " + square.getNrOfBombsAround());
				}
			}
		}
	}
	
	void printlowerAxis() {		
		System.out.print("  ");
		char a = 'A';
		for (int i = 0; i < size; i++) {
			System.out.print(" " + a);
			a++;
		}
		System.out.println("");
	}

	public HashMap<String, Square> getSquares() {
		return squares;
	}
	
	public boolean mark(String key) {
		//TODO check if you understand the different true false
		if (squares.containsKey(key)) {
			if (squares.get(key).isMarked()) {
				squares.get(key).setMarked(false);
			} else {
				squares.get(key).setMarked(true);
			}
			return true;
		}
		return false;
	}
	
	public boolean areOnlyAndAllBombsMarked() {
		//TODO
		return false;
	}

}
