

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	
	
	JFrame myFrame = new JFrame();

	MyFrame(){
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Resize Me");
		setContentPane(new MyContentPane());
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
}
