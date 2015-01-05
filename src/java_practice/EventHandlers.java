package java_practice;
import javax.swing.JFrame;

public class EventHandlers {

	public static void main(String[] args) {
		user newUser = new user();
		newUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newUser.setSize(350, 100);
		newUser.setVisible(true);
	}
}
