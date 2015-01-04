package java_practice;
import java.util.Scanner;

class calc{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double var1, var2, answer;
		System.out.println("First num:");
		var1 = input.nextDouble();
		System.out.println("Second num:");
		var2 = input.nextDouble();
		answer = var1 + var2;
		System.out.println(answer);
		input.close();
	}
}