import java.util.ArrayList;

public class SpaceAgency {

	ArrayList<SpaceShips> ss = new ArrayList<SpaceShips>();
	
	void addShip(SpaceShips s) {
		
		ss.add(s);
		
	}
	
	void showInfo() {
		
		for (int i = 0; i < ss.size(); i++)
		
		ss.get(i).printInfo();
	}
	
}
