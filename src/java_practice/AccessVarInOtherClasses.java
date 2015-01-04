package java_practice;
class AccessVarInOtherClasses{
	public static void main(String[] args) {
	  // TimeClassMethods.hour = 7;	 returns error `not visible` cause .hour is private in TimeClassMethods
		TimeClassPublic TimeClassPublicObject = new TimeClassPublic();
	    System.out.println(TimeClassPublicObject.toString());

	    TimeClassPublicObject.setTime(13, 27, 6); // access h, m, s vars in TimeClassPublic and override them.
	    System.out.println(TimeClassPublicObject.toString());
	}
}