package layouts;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Layout extends JFrame {
	
	private JButton lb; //lb for left button
	private JButton cb; //cb for center button
	private JButton rb; //rb for right button
	private FlowLayout layout;
	private Container container;
	
	public Layout() {
		super("Title here");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		lb = new JButton("left");
		cb = new JButton("center");
		rb = new JButton("right");
		add(lb);
		add(cb);
		add(rb);
		
		lb.addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					layout.setAlignment(FlowLayout.LEFT);
					layout.layoutContainer(container);
				}
			}
		);
		
		cb.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
		);
		
		rb.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
		);
	}
}
