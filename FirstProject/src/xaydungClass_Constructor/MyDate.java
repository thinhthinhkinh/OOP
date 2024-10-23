package xaydungClass_Constructor;

public class MyDate {
	private int ngay, thang, nam;
	public MyDate(int d, int m, int y) {
		this.ngay = d;
		this.thang = m;
		this.nam = y;
	}
	public void printDay() {
		System.out.println("Day: "+this.ngay);
	}
	public void printMonth() {
		System.out.println("Month: "+this.thang);
	}
	public void printYear() {
		System.out.println("Year: "+this.nam);
	}
	public void printDate() {
		System.out.println("Date: "+this.ngay+ "-" +this.thang+"-"+this.nam);
	}
}
