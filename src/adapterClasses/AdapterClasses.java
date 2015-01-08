package adapterClasses;

import javax.swing.JFrame;

public class AdapterClasses {

	public static void main(String[] args) {
		Gui go = new Gui();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setVisible(true);
		go.setSize(400, 400);
	}

}
