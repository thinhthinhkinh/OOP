package ontap_Cafe;

public class Test {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("G7", 100000, 6);
		System.out.println("Tong tien: "+hd.tinhTongTien());
		
		System.out.println("Kiem tra khoi luong lon hon 2kg: "+hd.kiemtraKhoiLuongLonHon(2));
		System.out.println("Kiem tra tong tien > 500000: "+hd.moneychecklonhon500k());
		
		System.out.println("Giam gia cua hd la: "+hd.giamGia(10));
		System.out.println("Giam gia cua hd2 la: "+hd2.giamGia(10));
		System.out.println("So tien sau khi giam gia cua hd2: "+hd2.giaSauKhiGiam(10));
	}
}
