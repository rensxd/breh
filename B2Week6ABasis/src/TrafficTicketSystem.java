import java.util.HashMap;

public class TrafficTicketSystem {

	private HashMap<String, Car> carTickets;

	TrafficTicketSystem() {

		carTickets = new HashMap<String, Car>();

	}

	void addCar(String numberPlate, Car car) {

		carTickets.put(numberPlate, car);

	}

	void addTicket(String numberPlate, String description) {

		if (carTickets.containsKey(numberPlate)) {
			carTickets.get(numberPlate).addTicket(description);
			
		} else {
			System.out.println("Auto met kentenken: " + numberPlate + " zit niet in de database");
			
		}

	}

	void showTicket(String numberPlate) {

		if (carTickets.containsKey(numberPlate)) {
			carTickets.get(numberPlate).printCarInfo();
		
		} else {
			System.out.println(numberPlate + " Heeft geen bekeuring");
		}

	}

	void payTickets(String numberPlate) {

		if (carTickets.containsKey(numberPlate)) {
			System.out.println(numberPlate + " <- zijn bekeuringen worden verwijderd");
			carTickets.get(numberPlate).payTickets();
		}
		

	}

	void showAllTickets() {

		for (String b : carTickets.keySet()) {
			if (carTickets.get(b).hasOpenTickets()) {
				carTickets.get(b).printCarInfo();
			}
		}

	}

	void showTickets(String numberPlate) {

		if (carTickets.containsKey(numberPlate)) {
			carTickets.get(numberPlate).printCarInfo();
		}
		

	}

}
