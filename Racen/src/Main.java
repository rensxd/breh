
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaceTrack racetrack = new RaceTrack();
		racetrack.setDistance(1500);
		
		RaceCar car1 = new RaceCar();
		car1.setName("Rens");
		car1.setMaxSpeed(200);
		car1.setAcceleration(80);
		
		RaceCar car2 = new RaceCar();
		car2.setName("Bert");
		car2.setMaxSpeed(175);
		car2.setAcceleration(88);
		
		RaceCar car3 = new RaceCar();
		car3.setName("Henk");
		car3.setMaxSpeed(180);
		car3.setAcceleration(90);
		
		
		racetrack.addRaceCar(car1);
		racetrack.addRaceCar(car2);
		racetrack.addRaceCar(car3);
		
		
		
		racetrack.doRace();
		
	}

}
