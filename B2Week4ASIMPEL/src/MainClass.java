import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		int[] numberCollection = {1, 3, 4, 1, 5, 2, 3, 6, 6, 6, 4, 1, 2, 6, 2, 3, 1, 2, 1, 5, 5, 1, 1, 5, 4};
		ArrayList<FoundIntNumber> numberOccurrences = new ArrayList<FoundIntNumber>();

		for (int i = 0; i < numberCollection.length; i++) {
			int gevondennummer = numberCollection[i];
			boolean found = false;
			for (FoundIntNumber g : numberOccurrences) {
				if (g.getValue() == gevondennummer) {
					g.increaseNrCounted();
					found = true;
				}
			}
			if (found == false) {
			numberOccurrences.add(new FoundIntNumber(gevondennummer));
			}
		}
		int highestOcc = 0;
		int highestValue = 0;
		
		for (FoundIntNumber b: numberOccurrences) {
			if (b.getValue() > highestValue) {
				highestValue = b.getValue();
				highestOcc = b.getNrCounted();
				
			}
		}
		System.out.println("Hoogste getal is: " + highestValue + " En dat is zovaak tegen gekomen: " + (highestOcc + 1));
		
	}

//		FoundIntNumber getal = new FoundIntNumber();
		
		

	}


