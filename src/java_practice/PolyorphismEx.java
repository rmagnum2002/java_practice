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
	}

}
