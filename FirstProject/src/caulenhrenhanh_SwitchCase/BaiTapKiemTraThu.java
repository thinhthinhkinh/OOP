package caulenhrenhanh_SwitchCase;

import java.util.Scanner;

public class BaiTapKiemTraThu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		
		switch (n) {
			case 2: {
				System.out.println("Thứ hai");
				break;
			}
			case 3:{
				System.out.println("Thứ ba");	
				break;
			}
			case 4:{
				System.out.println("Thứ tư");
				break;
			}
			case 5:{
				System.out.println("Thu nam");
				break;
			}
			case 6:{
				System.out.println("Thu sau");
				break;
			}
			case 7:{
				System.out.println("Thu bay");
				break;
			}
			case 8:{
				System.out.println("Chu nhat");
				break;
			}
		default:
			System.out.println("Nhap du lieu sai.");
		}	
	}
	
	
}

