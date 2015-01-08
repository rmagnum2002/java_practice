package exception_handler;
import java.util.Scanner;;

public class Sample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 1;
		
		do{
			try {
				System.out.println("Enter first num: ");
				int n1 = input.nextInt();
				System.out.println("Enter second num: ");
				int n2 = input.nextInt();
				int res = n1/n2;
				System.out.println(res);
				x=2;
			} catch (Exception e) {
				System.out.printf("You cant do that - '%s', try again:\n", e.getMessage());
			}
		}while(x==1);
	}

}
