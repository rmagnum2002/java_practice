package layouts;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		Layout l = new Layout();
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setSize(400, 400);
		l.setVisible(true);
	}
}
