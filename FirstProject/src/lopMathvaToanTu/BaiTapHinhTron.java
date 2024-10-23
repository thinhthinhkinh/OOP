package lopMathvaToanTu;

import java.util.Scanner;

public class BaiTapHinhTron {
	public static void main(String[] args) {
		double r, chuVi, dienTich;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri ban kinh r: ");
		r = sc.nextDouble();
		
		//tinhchuvi
		chuVi = 2*Math.PI*r;
		System.out.println("CHu vi: "+chuVi);
		System.out.println("Chu vi = "+ Math.round(chuVi));
		System.out.println("Chu vi = "+ Math.round(chuVi*100.0)/100.0);
		
		//dientich
		dienTich = Math.PI*Math.pow(r, 2);
		System.out.println("Dien tich = " + dienTich);
		System.out.println("Dien tich = " + Math.round(dienTich));
		System.out.println("Dien tich = " + Math.round(dienTich*100.0)/100.0);
	}
}
