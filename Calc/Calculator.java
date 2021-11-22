package Calc;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
	private String[] symbols = {"Backspace","","","CE","C","7","8","9","/","sqrt","4","5","6","X","%","1","2","3","-","1/X","0","+/_",".","+","="};
	
	public Calculator() {
		try {
		    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
		 } catch (Exception e) {
		            e.printStackTrace();
		    
		 }
		
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTextField field = new JTextField();
		JPanel panel = new JPanel();
		field.setText("0.");
		field.setEnabled(false);
		
		panel.setLayout(new GridLayout(0,5,3,3));
		JButton[] buttons = new JButton[25];
		int idx = 0;  // symbols 넘버
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				buttons[idx] = new JButton(symbols[idx]);
				buttons[idx].setBackground(Color.yellow);
				if(j >= 3) {
					buttons[idx].setForeground(Color.RED);
				}
				else {
					buttons[idx].setForeground(Color.blue);
				}
				panel.add(buttons[idx]);
				idx++;
			}
		}
		
		add(field, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}
}
