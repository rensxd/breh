package oefentoets;

public class Cake {
	private String 	name;
	private boolean sugarFree;
	
	public Cake(String newName, boolean newSugarFree)
	{
		setName(newName);
		setSugarFree(newSugarFree);
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
	
	public String getInfoCake()
	{
		String retString = name;
		
		if (sugarFree == true)
		{
			retString = retString + " suikervrij";
		}
		return retString;
	}

}
