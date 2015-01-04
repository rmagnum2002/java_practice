package java_practice;
import java.util.Scanner;

class MethodsWithParams{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		
		System.out.println("Enter your name here");
		String name = input.nextLine();
		
		tunaObject.anotherMessage(name);
		input.close();
	}
}