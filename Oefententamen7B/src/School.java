
public class School {

	String name;
	Kind[] capa;
	int capaciteit;

	School(String name, int cap) {

		this.name = name;
		this.capaciteit = cap;
		capa = new Kind[capaciteit];
		
		
		
	}

	void plaatsKind(Kind kind) {

		int counter = 0;
		boolean toegevoegd = false;
		
		
		while (counter < capaciteit) {
			if (capa[counter] == null) {
				capa[counter] = kind;
				toegevoegd = true;
				break;
				
			}
		
			counter++;
			
			}
		if (toegevoegd == false) {
			System.out.println("Geen plek");
		}
			
	}

	void printSchool() {

		int counter = 0;

		System.out.println(name);
		while (counter < capa.length) {
			if (capa[counter] != null) {
				capa[counter].printInfo();
			}
			counter++;

		}

		counter = 0;
		double bedrag = 0;

		System.out.print("Het totaalbedrag van alle spaarpotten van alle kinderen samen = ");
		while (counter < capa.length) {
			if (capa[counter] != null) {
				bedrag = bedrag + capa[counter].spaarpot.getGespaardBedrag();
				counter++;
			}
			
		}
		System.out.println(bedrag);

	}
}
