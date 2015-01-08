package MouseEventHandler;

import javax.swing.JFrame;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class MouseEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gui go = new Gui();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setVisible(true);
		go.setSize(400, 400);
	}

}
