package java_practice;
import java.util.Scanner;

class IntData{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		int var1, var2, var3, var4;
		
		var1 = 11;
		var2 = 3;
		var3 = var1 / var2;
		var4 = var1 % var2;
		
		System.out.println("Divide result " + var3);
		System.out.println("Module result " + var4);
		input.close();
//		Module is how much was left after dividing.
//		Module of 11 / 3 is 2. 9 divides by 3 and ther are 2 lef to 11.
	}
}