
public class MainClass {

	public static void main(String[] args) {
		
		CodeWordChecker cwc = new CodeWordChecker();
		
		cwc.addWord("Panda", "Potato");
		cwc.addWord("pencil", "earwax");
		cwc.addWord("java", "maniac");
		cwc.addWord("student", "superman");
		cwc.addWord("rice", "guitar");
		cwc.addWord("humbug", "bazinga");
		
		cwc.addWord("java", "bazinga");
		
		cwc.showResponse("java");
		cwc.showResponse("pencil");
		cwc.showResponse("Java");
		
		cwc.removeCodePair("Panda");
		cwc.removeCodePair("Rens");
	}

}
