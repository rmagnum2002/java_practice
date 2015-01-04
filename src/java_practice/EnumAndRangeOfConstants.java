package java_practice;
import java.util.EnumSet;

public class EnumAndRangeOfConstants {
	public static void main(String[] args) {
		for (EnumPros people: EnumPros.values()) {
			System.out.printf("%s\t%s\t%s\n", 
					people, people.getDesc(), people.getYear());
		}
		System.out.println("\nAnd now for the range of constants!!!\n");
		
		for(EnumPros people: EnumSet.range(EnumPros.kelsey, EnumPros.candy)){
			System.out.printf("%s\t%s\t%s\n", 
					people, people.getDesc(), people.getYear());
		}
	}
}

enum EnumPros {
	bucky("nice", "22"),
	kelsey("cutie", "10"),
	julia("bigmistake", "12"),
	nicole("italian", "13"),
	candy("different", "14"),
	erin("iwish", "16");
	
	private final String desc;
	private final String year;
	
	EnumPros(String descrition, String birthday) {
		desc = descrition;
		year = birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
}