import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setBounds(0, 0, screenSize.width / 2, screenSize.height / 2);
		myFrame.setLocation(screenSize.width / 2 - myFrame.getSize().width / 2, screenSize.height / 2 - myFrame.getSize().height / 2);
		myFrame.setResizable(false);
		myFrame.setPreferredSize(new Dimension(screenSize.width / 2, screenSize.height / 2));
		
		myFrame.setTitle("Prog3 week4a BASIS");
		myFrame.getContentPane().setBackground(Color.GREEN);
		

		
		
		myFrame.setVisible(true);
		
		
		
		System.out.println("Dit is het einde");

	}

}
