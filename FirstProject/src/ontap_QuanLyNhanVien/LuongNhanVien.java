package ontap_QuanLyNhanVien;

import java.util.Scanner;

class LuongNhanVien {
    private String maNhanVien;
    private int thang;
    private int nam;
    private int soSanPham;
    private final int donGia = 50000;

    // Constructor
    public LuongNhanVien(String maNhanVien, int thang, int nam, int soSanPham) {
        this.maNhanVien = maNhanVien;
        this.thang = thang;
        this.nam = nam;
        this.soSanPham = soSanPham;
    }

    // Getters and Setters
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public int tinhLuong() {
        return soSanPham * donGia;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10d %-10d %-15d %-10d", maNhanVien, thang, nam, soSanPham, tinhLuong());
    }
}