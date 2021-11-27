package Week8;

import java.awt.*;
import javax.swing.*;

public class TextTest extends JFrame {
	public TextTest() {
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel label1 = new JLabel("화씨 온도");
		JLabel label2 = new JLabel("섭씨 온도");
		JTextField f1 = new JTextField(15);
		JTextField f2 = new JTextField(15);
		JButton button = new JButton("변환");
		
		panel.add(label1);
		panel.add(f1);
		
		panel.add(label2);
		panel.add(f2);

		panel.add(button);
		
		setSize(300,150);
		setVisible(true);
		setTitle("온도 변환기");
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		TextTest t = new TextTest();
	}
}
