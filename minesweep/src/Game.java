import java.util.Scanner;

public class Game {

	// variabele //
	
	private MineField field;
	private Scanner scanner;
	private int bombChance;

	public Game(Scanner scanner, int fieldSize, int bombChance) {

		// Initialize//
		this.scanner = scanner;
		this.bombChance = bombChance;

		field = new MineField();
		field.makeField(fieldSize, bombChance);
	}

	int getFieldSize() {
		return field.getSize();
	}

	public int getBombChance() {
		return bombChance;
	}

	public void play() {
		
		// game loop //
		scanner.nextLine();
		boolean active = true;
		while (active) {
			field.print();
			System.out.println("Voer een combinatie in");
			String s = scanner.nextLine();
			
			if (isUserInputMark(s)) {
				String key = getSquareToMark(s);
				if (field.mark(key)) {
					if (field.areOnlyAndAllBombsMarked()) {
						System.out.println("*** Gefeliciteerd, je hebt alle bommen gevonden! ***");
						active = false;
					}
				}
			} else {
				//TODO check if already tested
				//and either make a field.test(key) for it, or change the field.mark() above to stay consistent
				if (field.getSquares().containsKey(s)) {
					field.getSquares().get(s).setTested(true);
					if (field.getSquares().get(s).isBomb()) {
						System.out.println("BOEM! Je hebt helaas verloren.");
						active = false;
					}
				}
			}
			
		}
	}
	
	private boolean isUserInputMark(String s) {
		if (s.length() < 2) {
			return false;
		}
		return s.charAt(0) == '*';
	}
	
	private String getSquareToMark(String s) {
		String[] b = s.split("\\*");
		return b[1]; 
	}

}
