package Week8_Prac;

import javax.swing.*;
import java.awt.*;

public class MyFrame10 extends JFrame {
	public MyFrame10(){
		try {
		    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
		 } catch (Exception e) {
		            e.printStackTrace();    
  }
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.orange);
		
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.YELLOW);
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.green);
		
		panel.add(b1);
		panel.add(b2);
		add(panel);
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame10 f = new MyFrame10();
	}
}
