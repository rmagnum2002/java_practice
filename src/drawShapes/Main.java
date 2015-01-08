package drawShapes;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("Shapes");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Shapes s = new Shapes();
		s.setBackground(Color.WHITE);
		f.add(s);
		f.setSize(500, 400);
		f.setVisible(true);
	}

}
