
public class Planet {

	private String naam;
	private int massa;
	private int afstandTotZon;
	private boolean isLife;
	private int aantalMaan;
	
	Planet(String naam, int massa, int afstandTotZon, boolean isLife, int aantalmaan){
		this.naam = naam;
		this.massa = massa;
		this.afstandTotZon = afstandTotZon;
		this.isLife = isLife;
		this.aantalMaan = aantalmaan;
		
	}
	
	void addPlanet(Planet planet) {
		planet = new Planet(naam, massa, afstandTotZon, isLife, aantalMaan);
	}
	
	void printInfo() {
		
		System.out.println(naam + " " +  massa + " " + afstandTotZon + " " + isLife + " " + aantalMaan);
		
	}
	
}
