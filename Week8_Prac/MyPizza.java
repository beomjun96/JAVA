package Week8_Prac;

import javax.swing.*;
import java.awt.*;

public class MyPizza extends JFrame {
	public MyPizza() {
		setSize(600, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		p1.add(label);
		
		JButton b1 = new JButton("콤비피자");
		JButton b2 = new JButton("포테이토피자");
		JButton b3 = new JButton("불고기피자");
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		
		JLabel label2 = new JLabel("개수");
		p2.add(label2);
		JTextField f1 = new JTextField(10);
		p2.add(f1);
		
		p.add(p1);
		p.add(p2);
		add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyPizza p = new MyPizza();
	}
}
