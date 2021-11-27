package Week8_Prac;

import javax.swing.*;
import java.awt.*;

public class MyFrame3 extends JFrame {
	public MyFrame3() {
		setSize(300, 200);
		setTitle("MyFrame3");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		getContentPane().setBackground(Color.yellow);
		setLayout(new FlowLayout());
		JButton button = new JButton("button");
		add(button);
		JButton button1 = new JButton("exit");
		add(button1);
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}
}
