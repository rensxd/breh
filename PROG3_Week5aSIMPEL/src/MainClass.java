import javax.swing.JFrame;

public class MainClass {

	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame();
		MyContentPane mycontentpane = new MyContentPane();
		mycontentpane.create();
		myFrame.setContentPane(mycontentpane);
		myFrame.setTitle("PROG3 Week4b - anders");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(null);
		myFrame.setLocationRelativeTo(null);
		myFrame.pack();
		myFrame.setVisible(true);

		

	}

}
