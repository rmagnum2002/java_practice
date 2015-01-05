package java_practice;
import javax.swing.JOptionPane;

public class GraphicalUserInterface {
	public static void main(String[] args) {
		//	all gui are built with components
		String first_number = JOptionPane.showInputDialog("Enter first number");
		String second_number = JOptionPane.showInputDialog("Enter second number");
		
		int num1 = Integer.parseInt(first_number);
		int num2 = Integer.parseInt(second_number);
		int sum = num1 + num2;
		

		JOptionPane.showMessageDialog(null, "The answer is " +sum, "The Title", JOptionPane.INFORMATION_MESSAGE);
		// 1st param - position(null - center of the screen)
		// 2nd param - what you want to say, message
		// 3d param -what you want to appear on your title bar
		// 4th - the message that's gonna popup
	}
}
