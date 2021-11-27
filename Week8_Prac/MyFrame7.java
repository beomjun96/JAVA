package Week8_Prac;

import javax.swing.*;
import java.awt.*;

public class MyFrame7 extends JFrame {
	private JButton b1, b2;
	
	public MyFrame7() {
		setSize(300, 150);
		setTitle("Absolute Position Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		b1 = new JButton("Button #1");
		add(b1);
		b1.setLocation(10, 30);
		b1.setSize(90, 20);
		
		b2 = new JButton("Button #2");
		add(b2);
		b2.setLocation(100, 30);
		b2.setSize(90,20);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame7 f = new MyFrame7();
	}
}
