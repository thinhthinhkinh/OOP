package nhapdulieu;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten: ");
		String hoVaTen = sc.nextLine();
		System.out.println("Nhap ma sinh vien: ");
		String maSinhVien = sc.nextLine();
		System.out.println("Nhap vao diem thi: ");
		float diemThi = sc.nextFloat();	
		
		System.out.println("Ho va Ten: "+hoVaTen);
		System.out.println("Ma sinh vien: "+maSinhVien);
		System.out.println("Diem thi giua ki: "+diemThi);
	}
}
