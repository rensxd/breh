
public class FoundIntNumber {
	
	private int value;
	private int nrCounted;
	
	FoundIntNumber(int newValue){
		
		this.value = newValue;
	}
	
	int getValue() {
		return value;
	}
	
	int getNrCounted() {
		return nrCounted;
	}
	
	void increaseNrCounted() {
		nrCounted++;
	}
	

}
