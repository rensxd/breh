package oefentoets;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Order newOrder = new Order(10);
		
		newOrder.addCoffee("Cappuccino", 2);
		newOrder.addCoffee("Koffie Verkeerd", 3);
		newOrder.addCoffee("Espresso", 1);
		
		Cake myCake = new Cake("Moorkop", false);
		newOrder.addCake(myCake);
		myCake= new Cake("Appeltaart", true);
		newOrder.addCake(myCake);
		
		newOrder.addCake(new Cake("Appeltaart", false));
		
	//	System.out.println(newOrder.listSugarFreeCake());
		System.out.println("");
		newOrder.showOrder();
	}
}