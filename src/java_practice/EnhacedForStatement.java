package java_practice;
class EnhacedForStatement {
	public static void main(String[] args) {
		int array[] = {3,4,6,7,8};
		int total=0;
		
		for (int i: array) {
			total+=i;
		}
		
		System.out.println(total);
	}
}
