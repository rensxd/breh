import java.util.Scanner;

public class MineSweeper {

	// variabele //
	
	Scanner scanner;
	Game game;
	boolean active;

	MineSweeper() {

		// initialize //
		
		scanner = new Scanner(System.in);
		active = true;

	}

	public void start() {

		// userinput -> size of field and bomb chance //

		while (active) {

			int fieldSize = getFieldSizeFromUser();
			int bombChance = getBombChanceFromUser();

			game = new Game(scanner, fieldSize, bombChance);
			game.play();
			
			active = askNextGameFromUser();
		}

	}
	
	int getFieldSizeFromUser() {
		int fieldSize = 0;
		boolean validInput = false;

		while (!validInput) {
			System.out.println("Hoe groot moet het veld zijn? Kies tussen de 5 en de 20");
			if (!scanner.hasNextInt()) {
				System.out.println("Een getal aub");
			} else {
				fieldSize = scanner.nextInt();
				if (fieldSize < 5 || fieldSize > 20) {
					System.out.println("Tussen de 5 en 20 aub");
				} else {
					validInput = true;
				}
			}
		}

		return fieldSize;
	}
	
	int getBombChanceFromUser() {
		int bombChance = 0;
		boolean validInput = false;

		while (!validInput) {
			System.out.println("Welke percentage van aantal wil je? Getal tussen 10 en 25");
			if (!scanner.hasNextInt()) {
				System.out.println("Een getal aub");
			} else {
				bombChance = scanner.nextInt();
				if (bombChance < 10 || bombChance > 25) {
					System.out.println("Tussen de 10 en 25 aub");
				} else {
					validInput = true;
				}
			}
		}

		return bombChance;
	}
	
	boolean askNextGameFromUser() {
		boolean nextGame = true;
		boolean validInput = false;
		
		while (!validInput) {
			System.out.println("Wil je nog een keer spelen (ja/nee)?");
			String s = scanner.nextLine();
			if (s.equalsIgnoreCase("ja")) {
				nextGame = true;
				validInput = true;
			}
			if (s.equalsIgnoreCase("nee")) {
				nextGame = false;
				validInput = true;
			}
		}
		
		return nextGame;
	}

}
