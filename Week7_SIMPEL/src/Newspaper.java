
public class Newspaper {

	String name;
	int nrOfPages;
	String[] pages;

	Newspaper(String name, int nrOfPages) {
		this.name = name;
		this.nrOfPages = nrOfPages;
		this.pages = new String[nrOfPages];

	}

	void createPage(String text, int pagenumber) {

		int counter = 0;

		while (counter < pages.length) {
			if (pages[counter] == null) {
				pages[counter] = text;
				pagenumber = counter + 1;

			}
			counter++;
		}

	}

	void printNewspaper() {

		int counter = 0;

		while (counter < pages.length) {
			if (pages[counter] != null) {
				System.out.println(pages[counter]);
				counter++;
			}
			counter++;
		}

	}
}
