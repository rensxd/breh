import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise {

	ArrayList<Integer> myAL;

	ArrayListExercise() {
		myAL = new ArrayList<Integer>();
	}

	void addInt(int value) {
		myAL.add(value);
	}

	void clearList() {
		myAL.removeAll(myAL);
	}

	void removeInt(int value) {
		myAL.remove(value);
	}

	void sortList() {
		Collections.sort(myAL);
	}

	void inverseList() {
		Collections.reverse(myAL);
	}

	void printList() {
		for (Integer i : myAL) {
			System.out.println(i);
		}
	}
}
