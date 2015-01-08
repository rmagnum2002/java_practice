package jColorChooser;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class ColorChooser extends JFrame {

	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;
	
	public ColorChooser() {
		super("JColorChooser");
		panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose a color");
		b.addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					color = JColorChooser.showDialog(null, "Choose a color", color);
					if (color==null) {
						color = Color.WHITE;
					}
					
					panel.setBackground(color);
				}
			}
		);
		
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
		
	}
}
