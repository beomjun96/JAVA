package Week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
	private JButton button;
	private JLabel label;
	int cnt = 0;
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			cnt++;
			label.setText("현재의 카운터값: "+cnt);
		}
	}
	
	
	public Counter() {
		setSize(400,150);
		setTitle("이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: "+cnt);
		button.addActionListener(new MyListener());
		
		
		
		add(label);
		add(button);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		Counter c = new Counter();
	}
}