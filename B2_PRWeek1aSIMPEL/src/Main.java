
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GroupOfPeople groupofpeople = new GroupOfPeople();
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		person1.setAge(22);
		person1.setName("Jessica");
		person1.setGender('V');
		
		person2.setAge(33);
		person2.setName("Bert");
		person2.setGender('M');
		
		person3.setAge(23);
		person3.setName("Hans");
		person3.setGender('M');
		
		person4.setAge(11);
		person4.setName("Jasper");
		person4.setGender('M');
		
		person5.setAge(99);
		person5.setName("Berry");
		person5.setGender('M');
		
		
		groupofpeople.addPerson(person1);
		groupofpeople.addPerson(person2);
		groupofpeople.addPerson(person3);
		groupofpeople.addPerson(person4);
		groupofpeople.addPerson(person5);
		
		groupofpeople.findOldest();
		groupofpeople.findOldestt();
		groupofpeople.findYoungest();
		groupofpeople.findMen();
		groupofpeople.findMenn();
		groupofpeople.findWomen();
		
	}

}
