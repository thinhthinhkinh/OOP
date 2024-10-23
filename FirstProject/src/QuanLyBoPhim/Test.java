package QuanLyBoPhim;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15,05,2022);
		Ngay ngay2 = new Ngay(31, 01, 2025);
		Ngay ngay3 =  new Ngay(18, 8, 2022);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A", "Viet Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B", "Thuy Dien");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C", "Madagascar");
		
		BoPhim boPhim1 = new BoPhim("The Flash", 2019, hangSanXuat3, 85000, ngay2);
		BoPhim boPhim2 = new BoPhim("Running Man", 2021, hangSanXuat2, 100000, ngay1);
		BoPhim boPhim3 = new BoPhim("Khám phá Ba Lan", 2025, hangSanXuat1, 115000, ngay3);
	
		System.out.println("SS gia 1 re hon 2: "+ boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println("SS gia 3 re hon 2: "+ boPhim3.kiemTraGiaVeReHon(boPhim2));
	
		System.out.println("Tên hãng sản xuất BP 3: "+boPhim3.layTenHangSanXuat());
	
		System.out.println("BP1 giam 10%: "+ boPhim1.giaSauKhuyenMai(10));
		System.out.println("BP2 giam 20%: "+ boPhim2.giaSauKhuyenMai(20));
		System.out.println("BP3 giam 50%: "+ boPhim3.giaSauKhuyenMai(50));
	}
}
