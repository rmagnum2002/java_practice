package java_practice;
class TimeClassPublic{
	private int hour = 1;
	private int minute = 2;
	private int second = 3;
	
	public void setTime(int h, int m, int s){
		this.hour = 4;
		this.minute = 5;
		this.second = 6;
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour<12?"AM":"PM"));
	}
}