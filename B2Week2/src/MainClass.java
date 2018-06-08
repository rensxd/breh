import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		Planet planeet1 = new Planet("henk", 11, 222, true, 436);
		
		ArrayList<Planet> planets = new ArrayList<Planet>();
		planets.add(planeet1);

		for (Planet p: planets) {
			p.printInfo();
		}
		
	}

}
