public class MainClass {
	
	
	public static void main(String[] args) {
		
		int amountofNumbers = 5;
		ConsoleIO io = new ConsoleIO();
		int[] numbers = new int[amountofNumbers];
		int givenNumbers = 0;
		
		io.writeOutput("Type " + amountofNumbers + " numbers, each one followed by an <ENTER>");
		while (givenNumbers < amountofNumbers) {
			int input = Integer.parseInt(io.readInput());
			numbers[givenNumbers] = input;
			givenNumbers++;
		}
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		int total = 0;
		
		for(int i = 0; i < amountofNumbers; i++) {
			total += numbers[i];
			
			if (numbers[i] < lowest) {
				lowest = numbers[i];
			}
			if (numbers[i] > highest) {
				highest = numbers[i];
			}
		}
		System.out.println("In totaal waren je getallen: " + total);
		System.out.println("De laagste was: " + lowest);
		System.out.println("De hoogste was: " + highest);
		System.out.println("Het gemiddelde was: " + total / amountofNumbers);

	}

}
