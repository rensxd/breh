package prog1_week6b_basis;

public class RaceTrack {
	public RaceCar[] raceCars = new RaceCar[5];
	public RaceCar[] finishOrder = new RaceCar[5];
	public int distance;

	public void addRaceCar(RaceCar car) {
		int counter = 0;

		while (counter < raceCars.length) {
			if (raceCars[counter] == null) {
				raceCars[counter] = car;
				return;
			}
			counter++;
		}

		System.out.println("Cannot add RaceCar. Already 5 cars in race.");
	}

	public void doRace() {
		int finishNumber = 0;
		int amountToFinish = 0;
		int counter = 0;

		// Find out the amount of cars in this race.
		while (counter < raceCars.length) {
			if (raceCars[counter] != null) {
				amountToFinish++;
			}
			counter++;
		}

		// Do the racing
		while (finishNumber < amountToFinish) {
			counter = 0;

			while (counter < raceCars.length) {
				if (raceCars[counter] != null) {
					raceCars[counter].race();
					if (raceCars[counter].getLocation() > distance) {
						// car has crossed the finish!
						finishOrder[finishNumber] = raceCars[counter];
						// Remove car from race. It has finished.
						raceCars[counter] = null;
						finishNumber++;
					}
				}

				counter++;
			}
		}

		counter = 0;

		System.out.println("********************");
		System.out.println("* The Race Results *");
		System.out.println("********************");
		while (counter < amountToFinish) {
			System.out.println("position " + (counter + 1)
					+ ": " + finishOrder[counter].getName());
			counter++;
		}
	}

	public void setDistance(int newDistance) {
		if (newDistance > 0) {
			distance = newDistance;
		}
	}

}
