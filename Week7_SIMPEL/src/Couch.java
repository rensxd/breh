
public class Couch {

	int height;
	int depth;
	int length;
	String color;
	String covering;
	
	Couch() {
		
		this.height = 140;
		this.depth = 80;
		this.length = 70;
		this.color = "Gray";
		this.covering = "cotton";
		
		
	}
	
	void printInfo() {
		
	System.out.println(height + " " + depth + " " + length + " " + color + " " + covering);
			
		
	}
	
}
