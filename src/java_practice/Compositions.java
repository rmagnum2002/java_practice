package java_practice;
// used in ToString.java
public class Compositions {
	private String name;
	private ToStringMethods birthday;
	
	public Compositions(String theName, ToStringMethods theDate){
		name = theName;
		birthday = theDate;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", 
				name, birthday);
	}
}
