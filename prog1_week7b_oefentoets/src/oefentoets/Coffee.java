package oefentoets;

public class Coffee {
	private String	name;
	private int		size;
	
	public Coffee(String newName, int newSize)
	{
		setName(newName);
		setSize(newSize);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSize() {
		switch(size)
		{
		case 1: return "klein";
		case 2: return "middel";
		case 3: return "groot";
		default: return "onbekende grootte";
		}
	}
	
	public void setSize(int size) {
		if(size > 0)
		{
			if ( size < 4)
			{
				this.size = size;
				return;
			}
		}
		System.out.println("Size moet 1, 2 of 3 zijn.");	
	}
	
	public String getInfoCoffee()
	{
		return getName() + " - " + getSize();
	}
}
