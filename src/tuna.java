// used in MultipleClass.java
// used in MethodsWithParams.java
// used in MultipleMethodsAndInstanceVars

public class tuna {
	public void simpleMessage(){
		System.out.println("This is another class");
	}
	
	public void newMesage() {
		System.out.println("This is a new message");
	}
	
	public void anotherMessage(String name) {
		System.out.println("Hello " + name);
	}

//	Multiple Methods course
	
	private String girlName;
	
	public void setName(String name) {
		girlName = name;
	}

	public String getName() {
		return girlName;
	}

	public void saying() {
		System.out.printf("Your first gf was %s", getName());
	}
}
