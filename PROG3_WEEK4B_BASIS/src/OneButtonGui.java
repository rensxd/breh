import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OneButtonGui implements ActionListener {

	JFrame myFrame = new JFrame();
	JButton myButton = new JButton();
	
	
	
	
	public void create() {
		
		myFrame.setPreferredSize(new Dimension(300,300));
		myFrame.setTitle("Push that button");
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		
		myButton.setText("Start");
		myButton.addActionListener(this);
		
		myFrame.add(myButton);
		
		
	}

	public void actionPerformed(ActionEvent arg0) {
		String[] randomwords = new String[4];

		randomwords[0] = "Henk";
		randomwords[1] = "Piet";
		randomwords[2] = "Peter";
		randomwords[3] = "Rens";
		Random random = new Random();
		int i = random.nextInt(4);
		
		myButton.setText(randomwords[i]);
		
	}
	
}
