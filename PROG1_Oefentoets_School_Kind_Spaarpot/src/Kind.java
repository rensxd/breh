
public class Kind {

	// instance variables
	String name;
	int leeftijd;
	Spaarpot spaarpot; // de spaarpot van het kind

	// constructor
	Kind(String name, int leeftijd) {
		this.name = name;
		this.leeftijd = leeftijd;
		// bij het maken van het kind-object wordt ook een spaarpot-object
		// aangemaakt
		spaarpot = new Spaarpot();
	}

	// met deze methode worden de gegevens van het kind geprint
	void printInfo() {
		System.out.print(this.name + " " + this.leeftijd); 
	    System.out.println(" gespaard: " + spaarpot.getGespaardBedrag() + " euro");
	}

	// in deze methode krijgt het kind 1€ in zijn spaarpot
	void beloon() {
		this.spaarpot.spaar(1);
	}

}
