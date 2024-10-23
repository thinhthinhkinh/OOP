package pheptoancoban;
import java.util.Scanner;
public class pheptoancoban {
	public static void main(String[] args) {
		int a, b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao gia tri cua a: ");
		a = sc.nextInt();
		System.out.println("Nhap vao gia tri cua b: ");
		b = sc.nextInt();
		
		int tong = a + b;
		System.out.println(a+ " + " +b + " = " + tong);
		int hieu = a - b;
		System.out.println(a+ " - " +b + " = " + hieu);
		int nhan = a * b;
		System.out.println(a+ " * " +b + " = " + nhan);
		double thuong = (float)a / b;
		System.out.println(a+ " / " +b + " = "+ thuong);
		
		double chiadu = a % b;
		System.out.println(a+ " % " +b + " = " + chiadu);
	}
}
