package ontap_QuanLySinhVien;

public class Student {
    private String maSo;
    private String ho;
    private String ten;
    private double diem;

    public Student(String maSo, String ho, String ten, double diem) {
        this.maSo = maSo;
        this.ho = ho;
        this.ten = ten;
        this.diem = diem;
    }

    // Getters and setters
    public String getMaSo() { 
    	return maSo; 
    	}
    public void setMaSo(String maSo) { 
    	this.maSo = maSo; 
    	}
    public String getHo() { 
    	return ho; 
    	}
    public void setHo(String ho) { 
    	this.ho = ho; 
    	}
    public String getTen() { 
    	return ten; 
    	}
    public void setTen(String ten) { 
    	this.ten = ten; 
    	}
    public double getDiem() { 
    	return diem; 
    	}
    public void setDiem(double diem) { 
    	this.diem = diem; 
    	}

    @Override
    public String toString() {
        return "Mã số: " + maSo + ", Họ: " + ho + ", Tên: " + ten + ", Điểm: " + diem;
    }
}