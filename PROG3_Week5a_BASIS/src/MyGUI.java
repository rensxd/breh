import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyGUI extends JFrame {

	MyGUI(){
		super();
		setTitle("Paint Test");
	}
	
	void create(){
		MyContentPane mycontentpane = new MyContentPane();
		setContentPane(mycontentpane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		pack();
		
	}
	
}
