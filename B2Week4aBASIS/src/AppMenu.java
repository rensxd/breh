import java.util.ArrayList;

public class AppMenu {

	ArrayList<PhoneApp> appAList;
	
	AppMenu(){
		appAList = new ArrayList<PhoneApp>();
	}
	
	void addApp(PhoneApp app) {

		boolean oudeVersie = false;
		String naam = app.getName();
		double versionNew = app.getVersion();

		for (PhoneApp p : appAList) {
			if (p.getName().equals(naam)) {
				if (p.getVersion() < versionNew) {
					System.out.println("App: " + app.getName() + " is verwijderd");
					removeApp(app);
				}
				if (p.getVersion() > versionNew) {
					oudeVersie = true;
				}
				break;
			} 
		}
		if (!oudeVersie) {
			appAList.add(app);
		}
		if (oudeVersie) {
			System.out.println("Deze versie is lager dan die op dit moment is geinstalleerd. Update naar een nieuwere versie aub");
		}
	}
	
	
	void removeApp(PhoneApp app) {
		
		appAList.remove(app);
	}
	
	void printAppMenu() {
		System.out.println("Welkom tot het App menu");
		for (PhoneApp p: appAList) {
			System.out.println(p.getOmschrijving());
		}
	
		
	}
	
}
