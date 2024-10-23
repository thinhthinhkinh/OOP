package ontap_QuanLySach;

public class TacGia {
	private String tacGia;
	private Ngay ngaySinh;
	//constructors
	public TacGia(String tacGia, Ngay ngaySinh) {
		super();
		this.tacGia = tacGia;
		this.ngaySinh = ngaySinh;
	}
	//getters & setters
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
}
