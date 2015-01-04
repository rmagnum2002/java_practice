package java_practice;
import java.util.Scanner;

class IfStatement{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int test = 6;
		
		if (test == 9) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			test = input.nextInt();
			System.out.println((test == 9 ? "Yes" : "No"));
			input.close();
		}
	}
}