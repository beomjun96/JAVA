package Week8_Prac;

import javax.swing.*;
public class MyFrame1 extends JFrame {
	public MyFrame1() {
		setSize(300, 200);
		setTitle("MyFrame");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame1 f = new MyFrame1();
	}
}
