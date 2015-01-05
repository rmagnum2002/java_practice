package java_practice;

public class CatList {
	private Cat[] thelist = new Cat[5];
	private int i = 0;

	public void add(Cat d) {
		if (i < thelist.length) {
			thelist[i] = d;
			System.out.println("Dog added at index " +i);
			i++;
		}
	}
}
