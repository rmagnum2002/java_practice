package java_practice;
import java.util.Scanner;

class AssignmentAndIncrementOperators{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		int tuna = 5;
//		int bass = 18;
//		increment tuna variable before output
//		++tuna;
//		increment after output
//		tuna++;
//		use -- to decrement
		
//		tuna = tuna + 5; can use assignment operator here +=
		tuna += 8;
		input.close();
		
		System.out.println(tuna);
	}
}