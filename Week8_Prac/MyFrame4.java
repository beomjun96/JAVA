package Week8_Prac;

import javax.swing.*;
import java.awt.*;

public class MyFrame4 extends JFrame {
	MyFrame4(){
		setSize(300, 150);
		setTitle("BoarderLayoutTest");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		JButton b3 = new JButton("EAST");
		JButton b4 = new JButton("WEST");
		JButton b5 = new JButton("CENTER");
		
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4();
	}
}
