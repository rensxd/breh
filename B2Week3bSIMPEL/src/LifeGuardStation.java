import java.util.ArrayList;

public class LifeGuardStation {

	private ArrayList<LifeGuard> lifeguards;
	
	LifeGuardStation(){
		lifeguards = new ArrayList<LifeGuard>();
	}

	void addGuards(LifeGuard g) {

		lifeguards.add(g);
	}

	void printInfo() {

		for (LifeGuard lg : lifeguards) {

			lg.printInfo();

		}
		int counter = 0;
		for (LifeGuard lg : lifeguards) {
			if (lg.isHeeftZwemdiploma()) {
				counter++;

			}
		}

		if (counter <= lifeguards.size() / 2) {
			System.out.println("DICHT");
		} else {
			System.out.println("OPEN");
		}
	}

}
