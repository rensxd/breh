
public class Spaarpot {

	// instance variable
	double gespaardBedrag;

	// method
	void spaar(double inkomendBedrag) {
		this.gespaardBedrag += inkomendBedrag;
	}

	// getter
	double getGespaardBedrag() {
		return this.gespaardBedrag;
	}

}
