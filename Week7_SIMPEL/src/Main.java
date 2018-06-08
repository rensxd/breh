
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Newspaper newspaper = new Newspaper("Rens", 5);
		
		newspaper.createPage("Important News!", 1);
		newspaper.createPage("Wow, you read this far?", 5);
		newspaper.createPage("News you might want to know", 3);
		
		newspaper.printNewspaper();
//		Couch couch  = new Couch();
//		
//		couch.printInfo();

	}

}
