
public class Cake {

	String name;
	boolean sugarFree;
	
	
	Cake(String name, boolean sugarFree) {
		this.name = name;
		this.sugarFree = sugarFree;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSugarFree() {
		
		return sugarFree;

	}
	public void setSugarFree(boolean sugarFree) {
		
		this.sugarFree = sugarFree;
		
	}
	
	
	
}
