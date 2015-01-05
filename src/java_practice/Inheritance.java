package java_practice;

public class Inheritance {
	public static void main(String[] args) {
		cake cakeObject = new cake();
		potpie potpieObject = new potpie();
		cheese cheeseObject = new cheese();
		
		cakeObject.eat();
		potpieObject.eat();
		// potpieObject.spit(); you can't inherit private methods, method is not visible
 		cheeseObject.eat();
	}
}

class cake extends food{
	public void eat(){
		System.out.println("I am the overriden eat method");		
	}
}

class potpie extends food{}

class cheese extends cake{}

class food{
	@SuppressWarnings("unused")
	private void spit(){
		System.out.println("I am the inherited eat method");		
	}
	
	public void eat(){
		System.out.println("I am the inherited eat method");		
	}
}
