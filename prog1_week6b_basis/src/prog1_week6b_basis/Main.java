package prog1_week6b_basis;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RaceTrack raceTrack = new RaceTrack();
		
		raceTrack.setDistance(120);
		
		RaceCar raceCar = new RaceCar();
		raceCar.setName("Ferrari");
		raceCar.setAcceleration(20);
		raceCar.setMaxSpeed(270);
		
		RaceCar raceCar1 = new RaceCar();
		raceCar1.setName("Porsche");
		raceCar1.setAcceleration(9);
		raceCar1.setMaxSpeed(230);
		
		RaceCar raceCar2 = new RaceCar();
		raceCar2.setName("BMW");
		raceCar2.setAcceleration(10);
		raceCar2.setMaxSpeed(240);
		
		raceTrack.addRaceCar(raceCar);
		raceTrack.addRaceCar(raceCar1);
		raceTrack.addRaceCar(raceCar2);
		
		raceTrack.doRace();
	}

}
