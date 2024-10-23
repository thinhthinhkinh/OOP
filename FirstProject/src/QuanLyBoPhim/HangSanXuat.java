package QuanLyBoPhim;

public class HangSanXuat {
	private String tenHangSanXuat;
	private String quocGia;
	//constructors
	public HangSanXuat(String tenHangSanXuat, String quocGia) {
		this.tenHangSanXuat = tenHangSanXuat;
		this.quocGia = quocGia;
	}
	//getters & setters
	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public String getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}
	
	
}
