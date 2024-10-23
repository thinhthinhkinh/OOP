package QuanLySinhVien;

public class Ngay {
	private int ngay, thang, nam;
	//constructors
	public Ngay(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	//getters & setters
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nam;
		result = prime * result + ngay;
		result = prime * result + thang;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ngay other = (Ngay) obj;
		if (nam != other.nam)
			return false;
		if (ngay != other.ngay)
			return false;
		if (thang != other.thang)
			return false;
		return true;
	}
	
}
