
public class MainClass {

	public static void main(String[] args) {
		
//		boolean p = true, q = false, r = false, s = true;
//		System.out.println("Answer is: " + (p == (q || r)));
		
		ArrayListExercise ale = new ArrayListExercise();
		
		ale.addInt(5);
		ale.addInt(33);
		ale.addInt(1);;
		ale.addInt(145);
		ale.printList();
		
		ale.sortList();
		ale.printList();
		
		ale.inverseList();
		ale.printList();
		

	}

}
