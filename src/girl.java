// used in Constructor.java

public class girl {
//	Multiple Methods course
	
	private String girlName;
	// Constructor

	public girl(String name){
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}

	public String getName() {
		return girlName;
	}

	public void saying() {
		System.out.printf("Your first gf was %s \n", getName());
	}
}
