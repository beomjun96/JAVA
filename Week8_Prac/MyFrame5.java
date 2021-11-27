package Week8_Prac;

import javax.swing.*;
import java.awt.*;

public class MyFrame5 extends JFrame {
	public MyFrame5() {
		setSize(1000, 300);
		setTitle("FlowLayoutTest");
		setLayout(new FlowLayout(FlowLayout.TRAILING));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("Button4"));
		add(new JButton("Button5"));
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5();
	}
}
