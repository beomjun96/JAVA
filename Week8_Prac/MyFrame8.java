package Week8_Prac;


import javax.swing.*;
import java.awt.*;
public class MyFrame8 extends JFrame {
	public MyFrame8() {
		setSize(610, 300);
		setTitle("My Piano");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		for(int i =0 ;i<10; i++ ) {
			JButton button = new JButton("C" + i);
			button.setLocation(i*60, 100);
			button.setSize(50, 150);
			add(button);
		}
		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame8 f = new MyFrame8();
	}
}
