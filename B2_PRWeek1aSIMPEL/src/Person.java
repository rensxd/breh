
public class Person {

	private String name;
	private int age;
	private char gender;
	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Age has to be higher than 0");
		}
		this.age = age;

	}

	public char getGender() {

		return gender;
	}

	public void setGender(char gender) {

		if (gender == 'V') {

		}
		if (gender == 'M') {

		}
		this.gender = gender;

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
