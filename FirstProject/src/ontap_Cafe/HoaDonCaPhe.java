package ontap_Cafe;

public class HoaDonCaPhe {
	private String tenCaPhe;
	private double giaTien1kg;
	private double khoiLuong;
	public HoaDonCaPhe(String t, double gia, double kl) {
		this.tenCaPhe = t;
		this.giaTien1kg = gia;
		this.khoiLuong = kl;
	}
	public double tinhTongTien() {
		return this.giaTien1kg * this.khoiLuong;
	}
	public boolean kiemtraKhoiLuongLonHon(double kl) {
		return this.khoiLuong >kl;
	}
	public boolean moneychecklonhon500k() {
		return this.tinhTongTien() > 5000000;
		}
	public double giamGia(double x) {
		if(this.tinhTongTien()>500000) {
			return (x/100)*this.tinhTongTien();
		}else {
			return 0;
		}
	}
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - this.giamGia(x);
	}
}
