package java_practice;

public class InstanceVarsWithFinal {
	public static void main(String[] args) {
		lab labObject = new lab(10);
		
		for (int i = 0; i < 5; i++) {
			labObject.add();
			System.out.printf("%s", labObject);
		}
	}
}

class lab{
	private int sum;
	private final int NUMBER;
	
	public lab(int x){
		NUMBER = x;
	}
	
	public void add(){
		sum+=NUMBER;
	}
	
	public String toString(){
		return String.format("sum = %d\n", sum);
	}
}