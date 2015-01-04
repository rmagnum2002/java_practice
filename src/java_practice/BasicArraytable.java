package java_practice;
class BasicArraytable{
	public static void main(String[] args) {
		System.out.println("Index\tValue");
		int array[] = {2,4,5,6,7,8};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "\t" + array[i]);
		}		
	}
}