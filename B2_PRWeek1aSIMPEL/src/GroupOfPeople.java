
public class GroupOfPeople {

	private Person[] persons = new Person[5];

	public void addPerson(Person person) {

		int i = 0;
		boolean toegevoegd = false;

		while (i < persons.length) {
			if (persons[i] == null) {
				persons[i] = person;
				toegevoegd = true;
				break;
			}
			i++;
		}
		if (toegevoegd == false) {
			System.out.println("Geen plek voor person");
		}

	}

	public void findOldest() {

		int largest = 0;
		int i = 0;

		while (i < 4) {
			i++;
			if (persons[largest].getAge() < persons[i].getAge() && persons[i] != null) {
				largest = i;
			}

		}
		System.out.println("the oldest person is: " + persons[largest].getName());
	}

	public void findOldestt() {

		int largest = 0;

		for (int i = 0; i < persons.length; i++) {
			if (persons[largest].getAge() < persons[i].getAge()) {
				largest = i;
			}
		}
		System.out.println("The one with the oldest age is: " + persons[largest].getName());
	}

	public void findYoungest() {

		int youngest = 0;

		for (int i = 0; i < persons.length; i++) {
			if (persons[youngest].getAge() > persons[i].getAge()) {
				youngest = i;
			}

		}
		System.out.println("The youngest one is: " + persons[youngest].getName());

	}

	public void findMen() {

		System.out.println("De mannen zijn: ");

		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getGender() == 'M') {
				System.out.println(persons[i].getName());
			}

		}

	}
	
	public void findMenn() {
		
		int i = 0;
		
		System.out.println("De mannen zijn: ");
		
		while (i < persons.length) {
			if (persons[i] != null) {
				if (persons[i].getGender() == 'M') {
					System.out.print(persons[i].getName() + " - ");
				}
			}
			i++;
		}
		System.out.println("//");
	}
	
	public void findWomen() {
		
		System.out.println("De vrouwen zijn: ");
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getGender() == 'V') {
				System.out.println(persons[i].getName());
			}
		}
		
	}
	

}
