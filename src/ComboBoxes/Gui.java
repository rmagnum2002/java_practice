package ComboBoxes;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Gui extends JFrame{
	private JComboBox<String> box;
	private JLabel pic;
	
	private static String[] filename = {"b.png", "x.png"};
	private Icon[] pics = {
			new ImageIcon(getClass().getResource(filename[0])),
			new ImageIcon(getClass().getResource(filename[1]))
	};


	public Gui() {
		super("Comboboxes lesson");
		setLayout(new FlowLayout());
	
		box = new JComboBox<String>(filename);
		
		box.addItemListener(
			new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						pic.setIcon(pics[box.getSelectedIndex()]);
					}					
				}
			}
		);
		
		add(box);
		pic=new JLabel(pics[0]);
		add(pic);
	}
	
	public void filename() {
		for (int i = 0; i < filename.length; i++) {
			System.out.println(filename[i]);
		}
	}
}
