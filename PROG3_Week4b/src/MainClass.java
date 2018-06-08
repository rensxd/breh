import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass {

	public static void main(String[] args) {
	
		
		JFrame myFrame = new JFrame();
		myFrame.setTitle("PROG3 Week4b SIMPEL");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel myContentPane = new JPanel();
		myContentPane.setBackground(Color.RED);
		myContentPane.setPreferredSize(new Dimension(300, 300));
		
		myFrame.setContentPane(myContentPane);
		
		JPanel mySquare = new JPanel();
		mySquare.setBackground(Color.BLACK);
		myContentPane.add(mySquare);
		myContentPane.setLayout(null);
		mySquare.setBounds(50, 50, 200, 200);
		

		
		myFrame.pack();
		myFrame.setVisible(true);

	}

}
