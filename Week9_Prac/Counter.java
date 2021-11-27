package Week9_Prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;
	int cnt = 0;
	
	public void actionPerformed(ActionEvent e) {
		cnt++;
		label.setText("현재의 카운터값:" +cnt);
	}
	
	
	public Counter() {
		setSize(400, 150);
		setTitle("이벤트 예제");
		
		JPanel panel = new JPanel();
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: "+cnt);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		Counter c = new Counter();
	}
}
