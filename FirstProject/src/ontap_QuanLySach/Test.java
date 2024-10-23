package ontap_QuanLySach;

public class Test {
	public static void main(String[] args) {
		Ngay ngay = new Ngay(15, 10, 2024);
		Ngay ngay1 = new Ngay(10, 10, 2024);
		Ngay ngay2 = new Ngay(9, 9, 2024);
		
		
		TacGia tg1 = new TacGia("thinh", ngay2);
		TacGia tg2 = new TacGia("truong", ngay1);
		TacGia tg3 = new TacGia("pvtt", ngay);
		
		
		Sach sach1 = new Sach("LT C", 5000, 2023,tg1);
		Sach sach2 = new Sach("LT Python", 3000, 2025,tg2);
		Sach sach3 = new Sach("LT Java", 800, 2020,tg3);
		sach1.inTenSach();
		
		System.out.println("SO sanh sach 1 va 3: "
		           +sach1.kiemTraCungNamXuatBan(sach3));
		
		System.out.println("Sach 1 giam 10%: "+sach1.giaSauKhiGiam(10));
		System.out.println("Sach 2 giam 10%: "+sach2.giaSauKhiGiam(20));
		System.out.println("Sach 3 giam 10%: "+sach3.giaSauKhiGiam(30));
		
	}
}
