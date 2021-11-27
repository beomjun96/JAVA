package Week8;

import java.awt.*;
import javax.swing.*;

public class Pizza extends JFrame {
	Pizza(){
		setSize(600, 200);
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		JPanel pA = new JPanel();
		JPanel pB = new JPanel();
		
		JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		
		pA.add(label);
		JButton button1 = new JButton("콤보피자"); 
		JButton button2 = new JButton("포테이토피자"); 
		JButton button3 = new JButton("불고기피자");
		
		pB.add(button1);
		pB.add(button2);
		pB.add(button3);
		
		JLabel label2 = new JLabel("개수"); 
		JTextField f = new JTextField(10);
		pB.add(label2);
		pB.add(f);
		
		add(p);
		p.add(pA);
		p.add(pB);
		setVisible(true);
		
		
	}
	
	
	public static void  main(String[] args) {
		Pizza pizza1 = new Pizza();
	}
}
