package graphics;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Graphic g = new Graphic();
		f.add(g);
		f.setSize(400, 400);
		f.setVisible(true);
	}

}
