import java.util.Random;

public class LifeGuard {

	private String naam;
	private boolean heeftZwemdiploma;
	private Random random;
	
	LifeGuard(String naam){
		this.naam = naam;
		random = new Random();
		heeftZwemdiploma = random.nextBoolean();
	}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public boolean isHeeftZwemdiploma() {
		return heeftZwemdiploma;
	}
	public void setHeeftZwemdiploma(boolean heeftZwemdiploma) {
		this.heeftZwemdiploma = heeftZwemdiploma;
	}
	
	void printInfo() {
		System.out.println(naam + " " + heeftZwemdiploma);
	}
	
	
}
