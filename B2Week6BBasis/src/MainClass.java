
public class MainClass {

	public static void main(String[] args) {
		MorseCoder morsecode = new MorseCoder();
		
		String x = morsecode.wordToMorse("zoethoutwortelextract");
		morsecode.morseToWord(x);
		morsecode.morseToWord("a");

	}

}
