package Jlist;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame {
	private JList list;
	private static String[] colornames = {"black", "blue", "red", "white"};
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};

	public Gui(){
		super("Title");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(3);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
			new ListSelectionListener() {
				
				@Override
				public void valueChanged(ListSelectionEvent e) {
					getContentPane().setBackground(colors[list.getSelectedIndex()]);
				}
			}
		);
	
		// default background
		// getContentPane().setBackground(colors[0]);
		// or better
		list.setSelectedIndex(2);
	}
}
