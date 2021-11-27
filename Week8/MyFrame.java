package Week8;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300, 200);
		setTitle("MyFrame");
		setVisible(true);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());
		JButton button = new JButton("Button");
		JButton button2 = new JButton("Exit");
		add(button, BorderLayout.NORTH); 
		add(button2, BorderLayout.CENTER);
		setVisible(true);
		
		setBackground(Color.blue);
		getContentPane().setBackground(Color.yellow);
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
