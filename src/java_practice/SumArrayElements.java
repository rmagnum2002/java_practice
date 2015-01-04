package java_practice;
class SumArrayElements{
	public static void main(String[] args) {
		int array[] = {2,4,5,6,7,8,9};
		int sum=0;
		
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		
		System.out.println("Sum of these numbers is: " +sum);
	}
}