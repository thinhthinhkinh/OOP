package caulenhdieukien_if_else;

import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		System.out.println("Nhap b: ");
		b = sc.nextDouble();
		System.out.println("Nhap c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b,2) - 4*a*c;
		
		if(a==0) {
			System.out.println("Nhap du lieu sai. Vui long nhap lai(a>0)");
			
		}
		else {
			if(delta <0) {
				System.out.println("Phuong trinh vo nghiem.");
			}
			else if(delta ==0) {
				x1=-b/a;
				System.out.println("Phuong trinh co nghiem kep x1 = x2 = -b/a: "+x1);
			}
			else {
				x1=(-b - Math.sqrt(delta))/(2*a);
				x2=(-b + Math.sqrt(delta))/(2*a);
				System.out.println("X1: "+x1);
				System.out.println("X2: "+x2);
			}
			
		}
	}
}
