package java_practice;
import java.util.Random;

class RandomNumberGenerator{
	public static void main(String[] args) {
		Random dice = new Random();
		int number1; // temporary variable
		int number2; // temporary variable
		
		// first loop will generate random number from 0 to 5
		for (int i = 1; i < 10; i++) {
			number1 = dice.nextInt(6);
			System.out.println(number1 + " ");
		}
		System.out.println("--------------------------------------------");
		
		// second loop will generate random number from 1 to 6
		for (int i = 1; i < 10; i++) {
			number2 = 1 + dice.nextInt(6);
			System.out.println(number2 + " ");
		}
	}
}