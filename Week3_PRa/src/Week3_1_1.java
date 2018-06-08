
public class Week3_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// int[] getal = { -1, 2, 5, 14 };
	int[] getal = new int[4];
	
	getal[0] = -1;
	getal[1] = 2;
	getal[2] = 5;
	getal[3] = 14;
	
	int x = 0;
	
	while (x < getal.length)
	{ 
		System.out.println("x = " + getal[x]);
		
		if (getal[x] < 2) 
		{
			System.out.println("x is smaller than 2");
		}
		else if (getal[x] > 2)
		{
			System.out.println("x is larger than 2");
		}
		else
		{
			System.out.println("x is equal to 2");
		}
		x++;
	}
	
	
	}

}
// 	String[] studentNames = {"Peter", "Ger", "Jasper", "Bob", "Marieke"};

// System.out.println(studentNames[0]);
// System.out.println(studentNames[1]);
// System.out.println(studentNames[2]);
// System.out.println(studentNames[3]);
// System.out.println(studentNames[4]);