package sudung_SET_GET_toString_hashCode_eQuals;

public class MyDate {
	private int ngay, thang, nam;
	//constructors
	public MyDate(int d, int m, int y) {
		if(d >=1 && d<=31) {
			this.ngay = d;
		}else {
			this.ngay=d;
		}
		if(m>=1 && m<=12) {
			this.thang = m;
		}else {
			this.thang = m;
		}
		if(this.nam >=0) {
			this.nam = y;
		}else {
			this.nam =1;
		}
	}
	//setters va getters
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		if(ngay >=1 && ngay <=31) {
			this.ngay = ngay;
		}else {
			this.ngay =1;
		}
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		if(thang >=1 && thang <= 12) {
			this.thang = thang;
		}else {
			this.thang=1;
		}
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		if(nam >=1) {
			this.nam = nam;
		}else {
			this.nam=1;  
		}
	}
	public void printDate() {
		System.out.println("Date: "+this.ngay+ "-" +this.thang+"-"+this.nam);
	}
	
	@Override
	public String toString() {
		return "MyDate [day=" + ngay + ", month=" + thang + ", year=" + nam + "]";
	}
	//hashCode & equals
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
		MyDate other = (MyDate) obj;
		if (nam != other.nam)
			return false;
		if (ngay != other.ngay)
			return false;
		if (thang != other.thang)
			return false;
		return true;
	}

	
//	@Override
//	public String toString() {
//		return this.ngay + "/" + this.thang+ "/"+this.nam;
//	}
//	
}
