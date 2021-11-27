package Week8_Prac;

import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 200);
		setTitle("My Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JButton button = new JButton("Button");
		add(button);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}
