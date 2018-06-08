import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MorseCoder {
	
	private HashMap<Character, String> codeMorse;
	
	MorseCoder(){
		codeMorse = new HashMap<Character, String>();
		fillMorse();
	}
	
	void fillMorse() {
		codeMorse.put('a', "· —");
		codeMorse.put('b', "— · · ·");
		codeMorse.put('c', "— · — ·");
		codeMorse.put('d', "— · ·");
		codeMorse.put('e', "·");
		codeMorse.put('f', "· · — ·");
		codeMorse.put('g', "— — ·");
		codeMorse.put('h', "· · · ·");
		codeMorse.put('i', "· ·");
		codeMorse.put('j', "· — — —");
		codeMorse.put('k', "— · —");
		codeMorse.put('l', "· — · ·");
		codeMorse.put('m', "— —");
		codeMorse.put('n', "— ·");
		codeMorse.put('o', "— — —");
		codeMorse.put('p', "· — — ·");
		codeMorse.put('q', "— — · —");
		codeMorse.put('r', "· — ·");
		codeMorse.put('s', "· · ·");
		codeMorse.put('t', "—·");
		codeMorse.put('u', "· · —");
		codeMorse.put('v', "· · · —");
		codeMorse.put('w', "· — —");
		codeMorse.put('x', "— · · —");
		codeMorse.put('y', "— · — —");
		codeMorse.put('z', "— — · ·");
		
	}
	
	String wordToMorse(String word) {
		String henk = "";
		for (int i = 0; i < word.length(); i++) {
			if (codeMorse.containsKey(word.charAt(i))) {
				String x = codeMorse.get(word.charAt(i));
				System.out.println(i+1 + "  " + x);
			}
		}
		return henk;
	}
	
	void morseToWord(String morseCode) {
		
//		for (int i = 0; i < codeMorse.size(); i++) {	
//		if (codeMorse.containsValue(morseCode)) {
//			System.out.println(codeMorse.get);
//			}
//		}
//		System.out.println(codeMorse.keySet());
		
		if (codeMorse.containsValue(morseCode)) {
			System.out.println("ja");
		}
	}

}
