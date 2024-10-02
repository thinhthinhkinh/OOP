package tuan10_GiaoDich;

import java.util.Scanner;

public class GiaoDich {
    protected int MaGD, SoLuong;
    protected String NgayGD;
    protected double DonGia, ThanhTien;
    Scanner in = new Scanner(System.in);

    // Constructor mặc định
    protected GiaoDich() {
        this.MaGD = 0;
        this.NgayGD = "";
        this.DonGia = 0;
        this.SoLuong = 0;
        this.ThanhTien = 0;
    }

    // Constructor có tham số
    protected GiaoDich(int ma, int sl, String ngay, double dgia, double ttien) {
        this.MaGD = ma;
        this.NgayGD = ngay;
        this.DonGia = dgia;
        this.SoLuong = sl;
        this.ThanhTien = ttien;
    }

    // Getter và Setter
    protected int getMaGD() {
        return MaGD;
    }

    protected void setMaGD(int maGD) {
        MaGD = maGD;
    }

    protected int getSoLuong() {
        return SoLuong;
    }

    protected void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    protected String getNgayGD() {
        return NgayGD;
    }

    protected void setNgayGD(String ngayGD) {
        NgayGD = ngayGD;
    }

    protected double getDonGia() {
        return DonGia;
    }

    protected void setDonGia(double donGia) {
        DonGia = donGia;
    }

    protected double getThanhTien() {
        return ThanhTien;
    }

    protected void setThanhTien(double thanhTien) {
        ThanhTien = thanhTien;
    }

    // Phương thức nhập thông tin giao dịch
    protected void nhap() {
        System.out.print("Ma Giao Dich: ");
        MaGD = in.nextInt();
        in.nextLine(); // Đọc dòng còn lại
        System.out.print("Ngay Giao Dich (dd/MM/yyyy): ");
        NgayGD = in.nextLine();
        System.out.print("Don Gia: ");
        DonGia = in.nextDouble();
        System.out.print("So Luong: ");
        SoLuong = in.nextInt();
        this.ThanhTien = tinhThanhTien(); // Tính thành tiền ngay khi nhập
    }

    // Phương thức tính thành tiền (abstract)
    protected double tinhThanhTien() {
        return SoLuong * DonGia; // Cần được ghi đè trong lớp con
    }

    @Override
    public String toString() {
        return "GiaoDich [MaGD=" + MaGD + ", SoLuong=" + SoLuong + ", NgayGD=" + NgayGD + ", DonGia=" + DonGia + ", ThanhTien=" + ThanhTien + "]";
    }
}
