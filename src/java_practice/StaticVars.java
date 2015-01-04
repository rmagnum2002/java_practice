package java_practice;

public class StaticVars {
	public static void main(String[] args) {
		staticvarsopts member1 = new staticvarsopts("Megan", "Fox");
		staticvarsopts member2 = new staticvarsopts("Natalie", "Portman");
		staticvarsopts member3 = new staticvarsopts("Taylor", "Swift");
		
		System.out.println();
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		
		System.out.println();
//		call private static methods without building an object
		System.out.println(staticvarsopts.getMembers());
	}
}

class staticvarsopts{
	private String first;
	private String last;
	private static int members = 0;
	
	// constructor
	public staticvarsopts(String firstname, String lastname){
		first = firstname;
		last = lastname;
		members++;
		
		System.out.printf(
				"Constructor for %s %s, memebers in the club: %d\n",
				first, last, members);
	}
	
	public String getFirst(){
		return first;
	}
	public String getLast(){
		return last;
	}
	public static int getMembers(){
		return members;
	}
}