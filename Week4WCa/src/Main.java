
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		
		CoffeeMachine senseo;
		senseo = new CoffeeMachine();
		
	
		
		while ( a < 14 ) {
			
			senseo.makeCoffee();
			a++;
			
			if ( a == 13) {
				senseo.restock();
			}
		}
	
		

		
	}

}
