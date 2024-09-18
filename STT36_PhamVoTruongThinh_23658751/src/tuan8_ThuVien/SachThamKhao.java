package tuan8_ThuVien;

import java.util.Date;

public class SachThamKhao {
    private String maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXuatBan;
    private double thue;

    public SachThamKhao(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
        this.thue = thue;
    }

    public double tinhThanhTien() {
        return soLuong * donGia + thue;
    }

    @Override
    public String toString() {
        return "Sách tham khảo - Mã sách: " + maSach +
               ", Ngày nhập: " + ngayNhap +
               ", Đơn giá: " + donGia +
               ", Số lượng: " + soLuong +
               ", Nhà xuất bản: " + nhaXuatBan +
               ", Thuế: " + thue;
    }

    // Getters and setters
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }
    public Date getNgayNhap() { return ngayNhap; }
    public void setNgayNhap(Date ngayNhap) { this.ngayNhap = ngayNhap; }
    public double getDonGia() { return donGia; }
    public void setDonGia(double donGia) { this.donGia = donGia; }
    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public String getNhaXuatBan() { return nhaXuatBan; }
    public void setNhaXuatBan(String nhaXuatBan) { this.nhaXuatBan = nhaXuatBan; }
    public double getThue() { return thue; }
    public void setThue(double thue) { this.thue = thue; }
}