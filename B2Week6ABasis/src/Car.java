import java.util.ArrayList;

public class Car {

	private String ownerName;
	private String carType;
	private String color;
	
	private ArrayList<String> tickets;
	
	Car(String ownerName, String carType, String color){
		
		tickets = new ArrayList<String>();
		
		this.ownerName = ownerName;
		this.carType = carType;
		this.color = color;
		
	}
	
	boolean hasOpenTickets() {
		
		return !tickets.isEmpty();
	}
	
	void payTickets() {
		
		tickets.clear();
		
	}
	
	void addTicket(String ticket) {
		
		tickets.add(ticket);
		
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	void printCarInfo() {
		
		System.out.println(ownerName + " " + carType + " " + color);
		if (hasOpenTickets()) {
			for (String s: tickets) {
				System.out.println(s);
			}
		}
		else {
			System.out.println(" None");
		}
		
		
	
	}
}
