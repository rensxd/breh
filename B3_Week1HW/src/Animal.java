
public class Animal {

	protected String eetgeluid;
	protected String naam;
	
	public Animal() {
		
	}
	
	public Animal(String eetgeluid, String naam) {
		this.eetgeluid = eetgeluid;
		this.naam = naam;
		
	}


	public void Eat() {
		
		System.out.println(eetgeluid);
		
	}

}