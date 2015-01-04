package java_practice;
import java.util.Iterator;

class PassArraysInMethods{
	public static void main(String[] args) {
		int array[] = {3,4,5,6,7};
		change(array);
		
		for(int y:array)
			System.out.println(y);
	}
	
	public static void change(int x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i]+=5;
		}
	}
}