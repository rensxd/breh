package simpel1a;

public class Newspaper
{
	private String name;
	private int nrOfPages;
	private String[] pages;

	public Newspaper(String name, int numberOfPages)
	{
		this.name = name;
		nrOfPages = numberOfPages;
		pages = new String[nrOfPages];
	}
	
	public void createPage(String text, int pagenumber)
	{
		if (pagenumber > 0 && pagenumber <= nrOfPages)
		{
			// Set the text of this page (-1 because index starts at 0):
			pages[pagenumber-1] = text;
		}
	}
	
	// Print all the pages in the console:
	public void printNewspaper()
	{
		for (String currentPage : pages)
		{
			if (currentPage != null)
			{
				System.out.println(currentPage);
			}
		}
	}

}
