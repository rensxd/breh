
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order10 = new Order(10);

		order10.addCoffee("Cappuccino", 2);
		order10.addCoffee("Koffie Verkeerd", 3);
		order10.addCoffee("Espresso", 1);
		
		Cake cake = new Cake("Rens keek", true);
		Cake cake1 = new Cake ("Rensch kweek", true);
		
		order10.addCake(cake);
		order10.addCake(cake1);
		
		order10.showOrder();
		
		
	}

}
