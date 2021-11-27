package Week9_Prac;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Counter2 extends JFrame {
	private JButton button;
	private JLabel label;
	int cnt =0;
	
	public Counter2() {
		this.setSize(400,150);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: "+cnt);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt++;
				label.setText("현재의 카운터값: "+cnt);
			}
		});
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
