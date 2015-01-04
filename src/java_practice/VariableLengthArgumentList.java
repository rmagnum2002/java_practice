package java_practice;
class VariableLengthArgumentList{
	public static void main(String[] args) {
		System.out.println(average(43,45,78,7,5,56,987));
	}
	
	public static int average(int...numbers) {
		int total=0;
		for(int  x:numbers)
			total+=x;
		return total/numbers.length;
	}
}