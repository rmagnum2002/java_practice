package java_practice;

public class Polymorphism {

	public static void main(String[] args) {

		//grapes grapeObject = new grapes();
		//grapeObject.eat();
		
		// polyorphism starts here :)
		groceries grocery[] = new groceries[2];
		grocery[0] = new cherries();
		grocery[1] = new grapes();
		
		for (int i = 0; i < 2; i++) {
			grocery[i].eat();
		}

		for (int i = 0; i < 2; i++) {
			grocery[i].drink();
		}

		
		System.out.println("-----------------------------------------------");
		fatty fat = new fatty();
		//groceries food = new groceries(); - can't create object with abstract methods
		groceries food = new grapes();
		groceries po = new cherries();
		
		fat.digest(food);
		fat.digest(po);
	}

}

class cherries extends groceries{
	void eat() {
		System.out.println("these cherries are great");
	}

	public void drink() {
		System.out.println("these cherries made great juice");
	}
}

class grapes extends groceries{
	public void drink() {
		System.out.println("these grapes made great wine");
	}
}

class fatty{
	
//	groceries gr = new groceries(); - can't create object with abstract methods
	groceries cr = new cherries(); // the right way with abstract methods
	
	public void digest(groceries x){
		x.eat();
	}
}

abstract class groceries{
	void eat() {
		System.out.println("these fruits are great");
	}
	
	public abstract void drink(); 
}