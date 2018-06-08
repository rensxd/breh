
public class CoffeeMachine {
	int 	amountOfCoffee = 10;
	int 	amountOfChocolate = 10;
	int 	amountOfTea = 10;
	
	void makeCoffee() {
		
		if (amountOfCoffee > 0) {
		System.out.println("Here you have a cup of coffee");
		amountOfCoffee = amountOfCoffee - 1;
		}
		else {
			System.out.println("Helaas de koffie is op");
		}
		
	}
	
	void makeHotChocolate() {
		
		if (amountOfChocolate > 0) {
		System.out.println("Here you have a cup of hot chocolate");
		amountOfChocolate = amountOfChocolate - 1;
		
		}
		else {
			System.out.println("Helaas de hot chocolate is op");
		}
	}
	
	void makeTea() {
		if (amountOfTea > 0) {
			System.out.println("Here you have a nice cup of tea");
			amountOfTea = amountOfTea - 1;
		}
	}
	
	void restock() {
		amountOfCoffee = 10;
		amountOfChocolate = 10;
		amountOfTea = 10;
	}
	
}
