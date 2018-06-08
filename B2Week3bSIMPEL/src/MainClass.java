
public class MainClass {

	public static void main(String[] args) {
		
		LifeGuardStation lgstation = new LifeGuardStation();
		
		LifeGuard rens = new LifeGuard("Rens");
		LifeGuard dirk = new LifeGuard("Dirk");
		LifeGuard ben = new LifeGuard("Ben");
		LifeGuard henk = new LifeGuard("Henk");
		LifeGuard bart = new LifeGuard("Bart");
		
		lgstation.addGuards(rens);
		lgstation.addGuards(dirk);
		lgstation.addGuards(ben);
		lgstation.addGuards(henk);
		lgstation.addGuards(bart);
		
		lgstation.printInfo();

	}

}
