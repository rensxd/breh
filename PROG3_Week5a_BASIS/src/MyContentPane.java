import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyContentPane extends JPanel implements ActionListener {

	boolean buttonpressed = false;
	JButton myButton = new JButton("Knop");
	
	MyContentPane(){
		super();
		setLayout(null);
		setPreferredSize(new Dimension(400, 300));
		add(myButton);
		myButton.setBounds(300, 0, 100, 300);
		myButton.addActionListener(this);
			
	
	}

	@Override
	public void paintComponent(Graphics g) {
		
		if (buttonpressed == false) {
			g.setColor(Color.RED);
			g.fillRect(0, 0, 300, 300);
		
		}
		if (buttonpressed == true) {
			g.setColor(Color.YELLOW);
			g.fillRect(0, 0, 300, 300);
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		buttonpressed = true;
		myButton.setText("Done");
		repaint();		
		
	}
}
