
public class MainClass {

	public static void main(String[] args) {
		
		TrafficTicketSystem tts = new TrafficTicketSystem();

//		tts.addTicket("1337", "Iemand overreden");
//		tts.addTicket("1234", "Te hard gereden");
//		tts.addTicket("6666", "Te langzaam gereden");
//		tts.addTicket("1337", "Door rood gereden");
//		tts.addTicket("9876", "Verkeerd geparkeerd");
//		
//		tts.payTickets("6666");
//		
//		tts.showTicket("1337");
//		tts.showTicket("9999");
//		tts.showAllTickets();
		
		tts.addCar("7676", new Car("Rens", "Renault", "Zwart"));
		tts.addCar("3333", new Car("Randy", "Opel", "Paars"));
		tts.addCar("8888", new Car("Martijn", "Peugo", "Groen"));
		
		tts.addTicket("7676", "200 k/m te hard gereden");
		tts.addTicket("3333", "Botsing veroorzaakt");
		tts.addTicket("3333", "Boom omver gereden");
		tts.addTicket("8888", "Te slim voor deze wereld");
		
		tts.showTicket("3333");
		
		tts.showAllTickets();
	}

}
