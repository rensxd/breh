
public class Zoo {
		
	Animal[] animals;
	
	public Zoo(String naam, int x) {
		animals = new Animal[x];
	}

	public void addAnimal(Animal animal) {
		
		int i = 0;
		
		while (i < animals.length) {
			if(animals[i] == null) {
				animals[i] = animal;
				System.out.println(animals[i].naam);
				break;
			}
			
			else {
				i++;
			}
			
			
//		for (int i=0;i<animals.length; i++) {
//			animals[i] = animal;
//			System.out.println(animals[i].naam);
//			break;
		}
		
		
		
		
	}
	
	public void animalEat() {
		
		for(Animal a: animals) {
			a.Eat();
		}
		
	}
	
	

}