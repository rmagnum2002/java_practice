package java_practice;
class ElseIf{
	public static void main(String[] args) {
		int age = 32;
		
		if (age >= 60)
			System.out.println("You are a senior");
		else if (age >= 50)
			System.out.println("You are in your 50's");
		else if (age >= 40)
			System.out.println("You are in your 40's");
		else
			System.out.println("You are young");
	}
}