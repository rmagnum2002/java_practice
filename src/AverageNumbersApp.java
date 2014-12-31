import java.util.Scanner;

class AverageNumbersApp{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		while (counter < 10) {
			System.out.println("Put in grade " + (counter+1));
			grade = input.nextInt();
			total = total + grade;
			counter++;
		}
		input.close();
		
		average = total/10;
		System.out.println("Your average is " + average);
		System.out.println(average < 5 ? "You dind't passed" : "You have passed");
		
	}
}