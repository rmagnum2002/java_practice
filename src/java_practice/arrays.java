package java_practice;
class arrays {
	public static void main(String[] args) {
		int myarray[] = new int[10];
		
		myarray[0]=87;
		myarray[1]=543;
		myarray[2]=48;
		myarray[9]=65;
		
		System.out.println(myarray[1]);
		
//		another way to create an array
		int another_array[] = {2, 4, 5, 8, 9, 10};
		
		System.out.println(another_array[1]);
	}
}