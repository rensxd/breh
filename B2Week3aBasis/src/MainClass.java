
public class MainClass {

	public static void main(String[] args) {
		
		SpaceAgency sa = new SpaceAgency();
		
		SpaceShips een = new SpaceShips("Rens", "Maan");
		SpaceShips twee = new SpaceShips("Randy", "Mars");
		SpaceShips drie = new SpaceShips("Bert", "Jupiter");
		SpaceShips vier = new SpaceShips("Renshai", "Hemel");
		SpaceShips vijf = new SpaceShips("Renshell", "Hell");
		
		
		sa.addShip(een);
		sa.addShip(twee);
		sa.addShip(drie);
		sa.addShip(vier);
		sa.addShip(vijf);
		
		sa.showInfo();
		
	}

}
