package simpel1a;

public class MainClass
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Opdracht [1]:
		Couch c = new Couch(70, 80, 140, "grey", "cotton");
		c.printInfo();
		
		// Opdracht [3]:
		Newspaper newspaper = new Newspaper("DB Times", 5);
		newspaper.createPage("Important news!", 1);
		newspaper.createPage("Somewhat important news!", 2);
		newspaper.createPage("News you might want to know.", 3);
		newspaper.createPage("News which really isn’t all that important.", 4);
		newspaper.createPage("Wow, you read this far?", 5);

		newspaper.printNewspaper();

	}

}
