package java_practice;
// toString method
public class ToString {
	public static void main(String[] args) {
		ToStringMethods toStr = new ToStringMethods(4,5,6);
		Compositions toStrObject = new Compositions("Greg", toStr);
		
		System.out.println(toStrObject);
	}
}

class ToStringMethods{
	private int month;
	private int day;
	private int year;
	
	public ToStringMethods(int m, int d, int y){
		month = m;
		day = d;
		year = y;
		
		System.out.printf("The constructure fot this is %s\n", this);
		// keyword "this" is a reference to the current object
		// that will look for toSrting method.
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}