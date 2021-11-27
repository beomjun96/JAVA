package Week9;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class PaintCircle extends JFrame implements MouseListener {
	public PaintCircle() {
		addMouseListener(this);
		setSize(300,300);
		setTitle("Circle");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.orange);
		g.fillOval(e.getX()-30, e.getY()-30, 60, 60);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		PaintCircle pc = new PaintCircle();
	}
	
}
