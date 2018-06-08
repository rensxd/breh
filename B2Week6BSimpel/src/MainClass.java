import java.util.HashMap;

public class MainClass {

	
	
	public static void main(String[] args) {
		
//		String[] language = new String[2];
//		language[0] = "dutch";
//		language[1] = "english";
//		language[2] = "german";
		
		String language = "english";
		
		HashMap<String, String> dutchToDutch = new HashMap<String, String>();
		HashMap<String, String> dutchToEnglish = new HashMap<String, String>();
		HashMap<String, String> dutchToGerman = new HashMap<String, String>();
		
		dutchToDutch.put("Hallo", "Hallo");
		dutchToDutch.put("Hoe gaat het?", "Hoe gaat het?");
		dutchToDutch.put("Een fijne dag gewenst!", "Een fijne dag gewenst!");
		
		dutchToEnglish.put("Hallo", "Hello");
		dutchToEnglish.put("Hoe gaat het?", "How are you?");
		dutchToEnglish.put("Een fijne dag gewenst!", "Have a nice day!");
		
		dutchToGerman.put("Hallo", "Hallo");
		dutchToGerman.put("Hoe gaat het?", "Wie gehts?");
		dutchToGerman.put("Een fijne dag gewenst!", "Haben Sie einen schönen tag!");
		
		HashMap<String, String> currentLanguageHashMap = new HashMap<String, String>();
		
		
		switch(language) {
		case "dutch": currentLanguageHashMap.putAll(dutchToDutch);
			break;
			
		case "english": currentLanguageHashMap.putAll(dutchToEnglish);
			break;
			
		case "german": currentLanguageHashMap.putAll(dutchToGerman);
			break;
			
		default: currentLanguageHashMap.putAll(dutchToDutch);
		}
		
		System.out.println(currentLanguageHashMap.values());

	
		
		

	}

}
