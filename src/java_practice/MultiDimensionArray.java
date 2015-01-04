package java_practice;
class MultiDimenssionalArray{
	public static void main(String[] args) {
		int array[][] = {{4,5,6,7,8,9},{1,23,4,6,8,18}};
		int second_array[][] = {{31,32,33,34,35}, {43,56,89}, {8,9,6}};
		
		System.out.println("This is the first array");
		display(array);
		System.out.println("\n");
		System.out.println("This is the second array");
		display(second_array);
	}
	
	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.print(x[row][col]+"\t");
			}
			System.out.println();
		}
	}
}