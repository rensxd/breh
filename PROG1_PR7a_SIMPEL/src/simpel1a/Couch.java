package simpel1a;

public class Couch
{
	private int height;
	private int depth;
	private int length;
	private String color;
	private String covering;

	public Couch(int height, int depth, int length, String color, String covering)
	{
		this.height = height;
		this.depth = depth;
		this.length = length;
		this.color = color;
		this.covering = covering;
	}
	
	public void printInfo()
	{
		System.out.println("Dit type bank is standaard " + length + " [cm] lang, " + 
			depth + " [cm] diep en " + height + " [cm] hoog. Hij wordt geleverd in de kleur " + 
			color + " met bekleding (covering) van " + covering + ".");
	}
}
