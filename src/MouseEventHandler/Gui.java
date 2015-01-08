package MouseEventHandler;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Gui extends JFrame{
	
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public Gui() {
		super("Mouse Event");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);			
	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener{
		// MouseMotionListener events
		@Override
		public void mouseDragged(MouseEvent e) {
			statusbar.setText("You are dragging the mouse");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			statusbar.setText("You are moving the mouse");
		}
		// MouseListener events
		@Override
		public void mouseClicked(MouseEvent e) {
			statusbar.setText(String.format("Clicked at %d,%d", e.getX(), e.getY()));			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			statusbar.setText("Mouse pressed");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			statusbar.setText("Mouse released");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			statusbar.setText("Mouse entered");
			mousepanel.setBackground(Color.RED);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			statusbar.setText("Mouse exited");
			mousepanel.setBackground(Color.WHITE);
			
		}
		
	}
}
