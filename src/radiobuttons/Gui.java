package radiobuttons;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Gui extends JFrame {
	private JTextField tf;
	// declare variables
	private Font pf; // plain
	private Font bf; // bold
	private Font itf; // italic
	private Font bif; //bold and italic
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public Gui() {
		super("radio buttons");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Example text", 25);
		add(tf);
	
		pb = new JRadioButton("plain font", true);
		bb = new JRadioButton("bold font", false);
		ib = new JRadioButton("italic font", false);
		bib = new JRadioButton("bold and italic font", false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.ITALIC + Font.BOLD, 14);
		tf.setFont(pf);

		// this wait for event to happen, pass in font object to constructor
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));
	}
	
	private class HandlerClass implements ItemListener{
		private Font font;
		
		// the font object get variable font
		public HandlerClass(Font f){
			font = f;
		}
		
		@Override // sets font to the font object that was passed in
		public void itemStateChanged(ItemEvent e) {
			tf.setFont(font);
			
		}
	}

}
