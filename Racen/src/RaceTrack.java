
public class RaceTrack {
	
	RaceCar[] raceCars = new RaceCar[5];
	RaceCar[] finishorder = new RaceCar[5];
	int distance;
	
	
	void addRaceCar(RaceCar car) {
		
		int counter = 0; 
		while (counter < raceCars.length) {
			if (raceCars[counter] == null) {
				raceCars[counter] = car;
				return;
			}
			counter++;
		}
		
	}
	
	void doRace() {
		
		int counter = 0;
		int amountToFinish = 0;
		int finishnumber = 0;
		
		while (counter < raceCars.length) {
			if (raceCars[counter] != null) {
				amountToFinish++;
			}
			counter++;
			
		}
		
		counter = 0;
		
		while (counter < raceCars.length) {
			if (raceCars[counter] != null) {
				raceCars[counter].race();
				if (raceCars[counter].getLocation() > distance) {
					finishorder[finishnumber] = raceCars[counter];
					raceCars[counter] = null;
					finishnumber++;
				}
			}
			counter++;
		}
		
		counter = 0;
		
		while (counter < amountToFinish) {
			System.out.println("position " + (counter + 1) + ": " + finishorder[counter].getName());
			counter++;
		}
		
		
	}
	
	void setDistance(int newDistance){
		newDistance = distance;
	}
	
	

}
