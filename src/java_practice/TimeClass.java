package java_practice;
class TimeClass{
	public static void main(String[] args) {
		TimeClassMethods TimeClassMethodsObject = new TimeClassMethods();
		System.out.println(TimeClassMethodsObject.toMilitary());
		System.out.println(TimeClassMethodsObject.toString());
		
	    TimeClassMethodsObject.setTime(13, 27, 6);
	    System.out.println(TimeClassMethodsObject.toMilitary());
	    System.out.println(TimeClassMethodsObject.toString());
	}
}