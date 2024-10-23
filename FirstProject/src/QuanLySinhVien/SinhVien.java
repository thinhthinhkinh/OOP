package QuanLySinhVien;

public class SinhVien {
	private String maSV;
	private String hoVaTen;
	private Ngay ngaySinh;
	private double diemTB;
	private Lop lop;
	//constructors
	public SinhVien(String maSV, String hoVaTen, Ngay ngaySinh, double diemTB, Lop lop) {
		super();
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}
	//Lay ten khoa
	public String layTenKhoa() {
		return this.lop.getTenKhoa();
	}
	//Kiem tra Sinh vien co dat hay khong
	public boolean kiemTraThiDat() {
		return this.diemTB >= 5;
	}
	//Kiem tra cung ngay sinh
	public boolean cungNgaySinh(SinhVien svKhac) {
		return this.ngaySinh.equals(svKhac.ngaySinh);
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	
	
}
