package vonglapFOR;

public class InBangCuuChuong {
	public static void main(String[] args) {
		for(int i =2; i<=9; i++) {
			System.out.println("Bang cuu chuong "+i);
			for(int j = 1; j<=10;j ++) {
				System.out.println(i+ " x " +j + " = " +i*j);
			}
			System.out.println("----------");
		}
	}
}
