import java.util.Scanner;

public class Game {

	// variabele //
	
	private MineField field;
	private int grootte;
	private Scanner scanner;
	private int bombkans;

	public Game(int grootte, int bombkans) {

		// Initialized//
		scanner = new Scanner(System.in);
		this.grootte = grootte;
		this.bombkans = bombkans;
		setGrootte(grootte);
		field = new MineField();
		field.setVeldGrootte(grootte);
		field.makeField();
		play();
	}

	void setGrootte(int grootte) {
		this.grootte = grootte;
	}

	int getGrootte() {
		return grootte;
	}

	public int getBombkans() {
		return bombkans;
	}

	public void setBombkans(int bombkans) {
		this.bombkans = bombkans;
	}

	public void play() {
		
		// game loop //
		
		boolean active = true;
		while (active) {
			field.print();
			System.out.println("Voer een combinatie in");
			String s = scanner.nextLine();
			if (s.charAt(0) == '*') {
				String[] b = s.split("\\*");
				String f = b[1]; 
				if (field.getVakjes().containsKey(f)) {
					field.getVakjes().get(f).setMarked(true);
					System.out.println("Die zit in de hashmap");
				}
			}
			
		}


	}

}
