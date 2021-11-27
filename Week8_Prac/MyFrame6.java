package Week8_Prac;

import javax.swing.*;
import java.awt.*;

public class MyFrame6 extends JFrame {
	public MyFrame6() {
		setSize(300, 150);
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(0,3));
		
		add(new Button("Button1"));
		add(new Button("Button2"));
		add(new Button("Button3"));
		add(new Button("B4"));
		add(new Button("Long Button 5"));
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame6 f = new MyFrame6();
	}
}
