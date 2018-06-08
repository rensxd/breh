import java.util.Random;

public class Tiles {
	
	String type;
	
	Tiles(String type, int x, int y){
		this.type = type;
		
	}
	
	String getRandomType() {
		Random random = new Random();
		String[] randomType = new String[6];
		randomType[0] = "";
		randomType[1] = "Erts";
		randomType[2] = "Graan";
		randomType[3] = "Steen";
		randomType[4] = "Wol";
		randomType[5] = "Wood";
		int i = random.nextInt(1) + 5;
		return randomType[i];
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
