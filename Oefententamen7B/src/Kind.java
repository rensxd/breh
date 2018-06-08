
public class Kind {
	
	Spaarpot spaarpot;
	String name;
	int age;
	
	Kind(String name, int age){
		this.name = name;
		this.age = age;
		spaarpot = new Spaarpot();
	}
	
	void beloon(){
		
		this.spaarpot.spaar(1);
		
	}
	
	void printInfo() {
		
		System.out.println(name + " " + age + " Gespaard: " + this.spaarpot.getGespaardBedrag() + " euro");
		
	}

}
