
public class Spaarpot {

	double gespaardBedrag;
	
	double getGespaardBedrag() {
		
		return this.gespaardBedrag;
	}
	
	void spaar(double inkomendBedrag) {
		
		this.gespaardBedrag = this.gespaardBedrag + inkomendBedrag;
		
	}
	
}
