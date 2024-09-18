package tuan8_ThuVien;

import java.util.Date;
import java.util.Scanner;

public class TestQuanLySach {
    public static void main(String[] args) {
        testTaoSach();
        testTinhThanhTien();
        testNhapCung();
        testNhapMem();
        testQuanLySach();
    }

    public static void testTaoSach() {
        System.out.println("Test tạo sách:");
        SachGiaoKhoa sgk = new SachGiaoKhoa("SGK001", new Date(), 50000, 10, "NXB Giáo dục", "mới");
        System.out.println(sgk);

        SachThamKhao stk = new SachThamKhao("STK001", new Date(), 70000, 5, "NXB Khoa học", 5000);
        System.out.println(stk);

        System.out.println("Test tạo sách thành công.\n");
    }

    public static void testTinhThanhTien() {
        System.out.println("Test tính thành tiền:");
        SachGiaoKhoa sgkMoi = new SachGiaoKhoa("SGK001", new Date(), 50000, 10, "NXB Giáo dục", "mới");
        System.out.println("Thành tiền SGK mới: " + sgkMoi.tinhThanhTien());
        assert sgkMoi.tinhThanhTien() == 500000 : "Tính thành tiền SGK mới không chính xác";

        SachGiaoKhoa sgkCu = new SachGiaoKhoa("SGK002", new Date(), 50000, 10, "NXB Giáo dục", "cũ");
        System.out.println("Thành tiền SGK cũ: " + sgkCu.tinhThanhTien());
        assert sgkCu.tinhThanhTien() == 250000 : "Tính thành tiền SGK cũ không chính xác";

        SachThamKhao stk = new SachThamKhao("STK001", new Date(), 70000, 5, "NXB Khoa học", 5000);
        System.out.println("Thành tiền STK: " + stk.tinhThanhTien());
        assert stk.tinhThanhTien() == 355000 : "Tính thành tiền STK không chính xác";

        System.out.println("Test tính thành tiền thành công.\n");
    }

    public static void testNhapCung() {
        System.out.println("Test nhập cứng:");
        QuanLySach quanLySach = new QuanLySach();
        quanLySach.nhapCung();
        quanLySach.xuatDanhSachSach();
        System.out.println("Test nhập cứng thành công.\n");
    }

    public static void testNhapMem() {
        System.out.println("Test nhập mềm:");
        QuanLySach quanLySach = new QuanLySach();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin cho sách giáo khoa:");
        quanLySach.nhapSach(scanner);

        System.out.println("Nhập thông tin cho sách tham khảo:");
        quanLySach.nhapSach(scanner);

        System.out.println("Sách sau khi nhập mềm:");
        quanLySach.xuatDanhSachSach();
        System.out.println("Test nhập mềm thành công.\n");
    }

    public static void testQuanLySach() {
        System.out.println("Test quản lý sách:");
        QuanLySach quanLySach = new QuanLySach();
        quanLySach.nhapCung();

        System.out.println("Danh sách sách sau khi nhập cứng:");
        quanLySach.xuatDanhSachSach();

        System.out.println("\nTổng thành tiền sách giáo khoa: " + quanLySach.tinhTongThanhTienSachGiaoKhoa());
        System.out.println("Tổng thành tiền sách tham khảo: " + quanLySach.tinhTongThanhTienSachThamKhao());

        System.out.println("\nTrung bình cộng đơn giá sách tham khảo: " + quanLySach.tinhTrungBinhCongDonGiaSachThamKhao());

        System.out.println("\nSách giáo khoa của NXB Giáo dục:");
        quanLySach.xuatSachGiaoKhoaTheoNhaXuatBan("NXB Giáo dục");

        System.out.println("Test quản lý sách thành công.\n");
    }
}