
public class SpaceShips {

	private String name;
	private String bestemming;
	
	SpaceShips(String name, String bestemming){
		this.name = name;
		this. bestemming = bestemming;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBestemming() {
		return bestemming;
	}
	public void setBestemming(String bestemming) {
		this.bestemming = bestemming;
	}
	
	void printInfo() {
		System.out.println(name + " " + bestemming);
	}
}
