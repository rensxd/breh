
public class School {

	// instance variables
	String naam;
	int capaciteit; // het aantal kinderen dat de school maximaal kan
							// bevatten
	Kind[] kinderen;
	
	// constructor
	School(String schoolnaam, int capaciteit) {
		this.naam = schoolnaam;
		this.capaciteit = capaciteit;
		kinderen = new Kind[capaciteit];
	}

	void plaatsKind(Kind newkind) {
		int i = 0;
		boolean toegevoegd = false;
		while (i < kinderen.length) {
			if (kinderen[i] == null) {
				kinderen[i] = newkind;
				toegevoegd = true;
				break; // stopt de while-loop
			}
			i++;
		}
		if (toegevoegd == false) {
			System.out.println("er is helaas geen plaats meer voor " + newkind.name + " op deze school");
		}
	}

	void printSchool() {

		double totaalBedrag = 0;
		// naam van de school
		System.out.println(this.naam);
		// alle kinderen
		int i = 0;
		while (i < capaciteit) {

			if (kinderen[i] != null) {
				kinderen[i].printInfo();
				totaalBedrag += kinderen[i].spaarpot.getGespaardBedrag();
			}
			i++;
		}
		// totaalbedrag van alle spaarpotten van alle kinderen samen
		System.out.println("totaalbedrag van alle spaarpotten van alle kinderen samen = " + totaalBedrag + " euro");
	}

}
