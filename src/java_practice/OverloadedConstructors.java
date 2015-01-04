package java_practice;
class OverloadedConstructors {

	public static void main(String[] args) {
		OverloadedConstructorMethods timeObject = new OverloadedConstructorMethods();
		OverloadedConstructorMethods timeObject2 = new OverloadedConstructorMethods(5);
		OverloadedConstructorMethods timeObject3 = new OverloadedConstructorMethods(5,13);
		OverloadedConstructorMethods timeObject4 = new OverloadedConstructorMethods(5,13,43);
	
		System.out.printf("%s\n", timeObject.toMilitary());
		System.out.printf("%s\n", timeObject2.toMilitary());
		System.out.printf("%s\n", timeObject3.toMilitary());
		System.out.printf("%s\n", timeObject4.toMilitary());
	}

}

class OverloadedConstructorMethods{
	private int hour;
	private int minute;
	private int second;
	
	public OverloadedConstructorMethods() {
		this(0,0,0);
	}

	public OverloadedConstructorMethods(int h) {
		this(h,0,0);
	}
	
	public OverloadedConstructorMethods(int h, int m) {
		this(h,m,0);
	}

	public OverloadedConstructorMethods(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h) {
		hour = ((h>=0 && h<24) ? h : 0); 
	}
	public void setMinute(int m) {
		minute = ((m>=0 && m<60) ? m : 0); 
	}
	public void setSecond(int s) {
		second = ((s>=0 && s<60) ? s : 0); 
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinutes() {
		return minute;
	}
	public int getSeconds() {
		return second;
	}
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinutes(), getSeconds());
		
	}
}
