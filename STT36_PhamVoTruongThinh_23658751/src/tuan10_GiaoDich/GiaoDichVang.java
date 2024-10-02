package tuan10_GiaoDich;

public class GiaoDichVang extends GiaoDich {
    private String LoaiVang;

    // Constructor mặc định
    public GiaoDichVang() {
        super();
        this.LoaiVang = "";
    }

    // Constructor có tham số
    public GiaoDichVang(int ma, int sl, String ngay, double dgia, double ttien, String lvang) {
        super(ma, sl, ngay, dgia, ttien);
        this.LoaiVang = lvang;
    }

    // Getter và Setter cho LoaiVang
    public String getLoaiVang() {
        return LoaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        LoaiVang = loaiVang;
    }

    // Phương thức nhập thông tin giao dịch vàng
    @Override
    public void nhap() {
        super.nhap(); // Gọi phương thức nhập từ lớp cha
        System.out.print("Loai Vang: ");
        LoaiVang = in.next();
    }

    // Tính thành tiền cho giao dịch vàng
    @Override
    public double tinhThanhTien() {
        return this.ThanhTien = this.DonGia * this.SoLuong;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Giao Dich Vang: " + super.toString() + ", LoaiVang: " + LoaiVang + ", ThanhTien: " + ThanhTien + "]";
    }
}
