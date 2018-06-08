import java.util.HashMap;

public class CodeWordChecker {

	HashMap<String, String> words;

	CodeWordChecker() {
		words = new HashMap<String, String>();
	}

	void addWord(String codeWord, String respons) {
		
		
		if (words.containsKey(codeWord)) {
			words.put(codeWord, respons);
			System.out.println(codeWord + " " + respons  + " codewoord wordt overschreven");
		}
		else {
			words.put(codeWord, respons);
			System.out.println(codeWord + " " + respons + " Nieuw woord is toegevoegd");
		}
		
		
	}

	void showResponse(String codeWord) {
		
		if (!words.containsKey(codeWord)) {
			System.out.println(codeWord + " Woord staat er niet in");
		}
		else {
			System.out.println(words.get(codeWord));
		}

	}
	
	void removeCodePair(String codeWord) {
		
		if (words.containsKey(codeWord)) {
			System.out.println(codeWord + " wordt verwijderd");
			words.remove(codeWord);
		}
		else {
			System.out.println(codeWord + " staat niet in de lijst");
		}
		
		
	}

}
