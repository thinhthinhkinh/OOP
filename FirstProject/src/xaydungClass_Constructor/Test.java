package xaydungClass_Constructor;

public class Test {
	public static void main(String[] args) {
		int d;
		MyDate md = new MyDate(25, 2, 2029);
		md.printDate();
		md.printDay();
		md.printMonth();
		md.printYear();
	}
}
