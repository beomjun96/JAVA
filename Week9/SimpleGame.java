package Week9;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGame extends JFrame implements KeyListener{
	int n1, n2, n3;
	JButton button1, button2, button3;
	
	public SimpleGame() {
		setSize(300,150);
		setTitle("Simple Game Machine");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		button1 = new JButton(""+n1);
		//button1 = new JButton( Integer.toString(n1));
		button2 = new JButton(""+n2);
		button3 = new JButton(""+n3);
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		panel.requestFocus(); // 패널에 입력값을 받을 준비가 된 상태
		panel.setFocusable(true); // 창이 활성화 된 상태여야 입력 할수 있음
		panel.addKeyListener(this);  //implements 할 때 패널에 입력 되는 값 작동하게 하기
		
		add(panel);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		if(keycode == KeyEvent.VK_ENTER) {
			n1 = (int)(Math.random()*10);
			n2 = (int)(Math.random()*10);
			n3 = (int)(Math.random()*10);
			button1.setText(""+n1);
			button2.setText(""+n2);
			button3.setText(""+n3);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		SimpleGame s = new SimpleGame();
	}
}
