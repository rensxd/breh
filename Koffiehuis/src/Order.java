
public class Order {
	
	int tableNumber;
	Coffee[] coffeeArray;
	Cake[] cakeArray;
	
	Order(int tableNumber) {
		this.tableNumber = tableNumber;
		coffeeArray = new Coffee[10];
		cakeArray = new Cake[10];
		
	}
	
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public Coffee[] getCoffeeArray() {
		return coffeeArray;
	}
	public void setCoffeeArray(Coffee[] coffeeArray) {
		this.coffeeArray = coffeeArray;
	}
	public Cake[] getCakeArray() {
		return cakeArray;
	}
	public void setCakeArray(Cake[] cakeArray) {
		this.cakeArray = cakeArray;
	}

	
	void addCake(Cake newCake) {
		int counter = 0;
		while (counter < cakeArray.length) {
			if (cakeArray[counter] == null) {
				cakeArray[counter] = newCake;
				break;
			}
			counter++;
		}
		
	}
	
	void addCoffee(String name, int size) {
		
		
		Coffee coffee = new Coffee(name, size);
		
		int counter = 0;
		
		if (counter < coffeeArray.length) {
			if (coffeeArray[counter] == null) {
				coffeeArray[counter] = coffee;
			}
			
		}
		
		
	}
	
	void listSugarFreeCake() {
		int counter = 0;
		
		if (counter < cakeArray.length) {
			if (cakeArray[counter].isSugarFree()) {
				System.out.println(cakeArray[counter].getName() + " Suikervrij");
				counter++;
			}
			counter++;
			
		}
	}
	
	void showOrder() {
		
		int counter = 0;
		
		System.out.println("Tafelnummer: " + tableNumber);
		
		while (counter < cakeArray.length) {
			if (cakeArray[counter] != null) {
				System.out.print(cakeArray[counter].getName());
				System.out.println(" " +  cakeArray[counter].isSugarFree());
				counter++;
			}
			counter++;
		}
		
		while (counter < coffeeArray.length) {
			if (coffeeArray[counter] != null) {
				System.out.print(coffeeArray[counter].getName());
				counter++;
			}
			counter++;
		}

	}

}
