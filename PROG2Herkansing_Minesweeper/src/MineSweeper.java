import java.util.Scanner;

public class MineSweeper {

	// variabele //
	
	Scanner scanner;
	int fieldSize;
	Game game;
	int bombKans;
	boolean active;

	MineSweeper() {

		// initialized //
		
		scanner = new Scanner(System.in);
		fieldSize = 0;
		active = true;

	}

	public void start() {

		// userinput -> grootte veld en bomb kans // 
		
		while (active) {

			System.out.println("Hoe groot moet het veld zijn? Kies tussen de 5 en de 20");
			if (!scanner.hasNextInt()) {
				System.out.println("Een getal aub");
				continue;
			}
			if (scanner.hasNextInt()) {
				fieldSize = scanner.nextInt();
				if (fieldSize < 5 || fieldSize > 20) {
					System.out.println("Tussen de 5 en 20 aub");
					active = false;
				}
			}
			System.out.println("Welke percentage van aantal wil je? Getal tussen 10 en 25");
			if (!scanner.hasNextInt()) {
				System.out.println("Een getal aub");
				continue;
			}
			if (scanner.hasNextInt()) {
				bombKans = scanner.nextInt();
				if (fieldSize < 10 || fieldSize > 25) {
					System.out.println("Tussen de 10 en 25 aub");
				}
			}
			game = new Game(fieldSize, bombKans);
		}
	
		
	}

	void setfieldSize(int fieldSize) {
		this.fieldSize = fieldSize;
	}

	int getfieldSize() {
		return fieldSize;
	}

}
