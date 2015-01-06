package java_practice;

public class PolyorphismEx {

	public static void main(String[] args) {
		System.out.println("Handle cat list class:");
		CatList cl = new CatList();
		Cat c = new Cat();
		cl.add(c);

		System.out.println("\nHandle multiple classes:");
		AnimalList ALO = new AnimalList();
		Cat c1 = new Cat();
		Fish f = new Fish();
		ALO.add(c1);
		ALO.add(f);
		
		System.out.println("\nLoop through arrays and apply method on each:");
		Animal[] thelist = new Animal[2];
		Cat ct = new Cat();
		Fish fs = new Fish();
		
		thelist[0] = ct;
		thelist[1] = fs;
		
		for (Animal x: thelist) {
			x.noise();
		}
	}

}
