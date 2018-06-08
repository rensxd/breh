
public class PhoneApp {

	private String name;
	private int memorySize;
	private double version;
	
	
	PhoneApp(String name, int memorySize, double version){
		this.name = name;
		this.memorySize = memorySize;
		this.version = version;
	}
	
	String getName() {
		return name;
	}
	
	int getMemorySize() {
		return memorySize;
	}
	
	void updateApp(Double newVersion) {
		this.version = newVersion;
	}
	
	double getVersion() {
		return version;
	}
	
	String getOmschrijving(){
		return name + " " + memorySize + " " + version;
	}
	
}
