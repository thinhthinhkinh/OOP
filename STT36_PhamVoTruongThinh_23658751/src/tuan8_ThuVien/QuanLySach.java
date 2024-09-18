package tuan8_ThuVien;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    private List<SachGiaoKhoa> danhSachSachGiaoKhoa;
    private List<SachThamKhao> danhSachSachThamKhao;

    public QuanLySach() {
        this.danhSachSachGiaoKhoa = new ArrayList<>();
        this.danhSachSachThamKhao = new ArrayList<>();
    }

    public void nhapSach(Scanner scanner) {
        System.out.println("Nhập loại sách (1: Sách giáo khoa, 2: Sách tham khảo):");
        int loaiSach = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Nhập mã sách:");
        String maSach = scanner.nextLine();

        System.out.println("Nhập ngày nhập (dd/MM/yyyy):");
        String ngayNhapStr = scanner.nextLine();
        Date ngayNhap = new Date(); // Giả sử ngày hiện tại, cần xử lý parse ngày thực tế

        System.out.println("Nhập đơn giá:");
        double donGia = scanner.nextDouble();

        System.out.println("Nhập số lượng:");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("Nhập nhà xuất bản:");
        String nhaXuatBan = scanner.nextLine();

        if (loaiSach == 1) {
            System.out.println("Nhập tình trạng (mới/cũ):");
            String tinhTrang = scanner.nextLine();
            danhSachSachGiaoKhoa.add(new SachGiaoKhoa(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, tinhTrang));
        } else {
            System.out.println("Nhập thuế:");
            double thue = scanner.nextDouble();
            danhSachSachThamKhao.add(new SachThamKhao(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, thue));
        }
    }

    public void xuatDanhSachSach() {
        System.out.println("Danh sách sách giáo khoa:");
        for (SachGiaoKhoa sach : danhSachSachGiaoKhoa) {
            System.out.println(sach);
        }
        System.out.println("Danh sách sách tham khảo:");
        for (SachThamKhao sach : danhSachSachThamKhao) {
            System.out.println(sach);
        }
    }

    public double tinhTongThanhTienSachGiaoKhoa() {
        return danhSachSachGiaoKhoa.stream()
                .mapToDouble(SachGiaoKhoa::tinhThanhTien)
                .sum();
    }

    public double tinhTongThanhTienSachThamKhao() {
        return danhSachSachThamKhao.stream()
                .mapToDouble(SachThamKhao::tinhThanhTien)
                .sum();
    }

    public double tinhTrungBinhCongDonGiaSachThamKhao() {
        if (danhSachSachThamKhao.isEmpty()) {
            return 0;
        }
        double tongDonGia = danhSachSachThamKhao.stream()
                .mapToDouble(SachThamKhao::getDonGia)
                .sum();
        return tongDonGia / danhSachSachThamKhao.size();
    }

    public void xuatSachGiaoKhoaTheoNhaXuatBan(String nhaXuatBan) {
        danhSachSachGiaoKhoa.stream()
                .filter(sach -> sach.getNhaXuatBan().equalsIgnoreCase(nhaXuatBan))
                .forEach(System.out::println);
    }

    // Phương thức nhập cứng (hardcoded) dữ liệu mẫu
    public void nhapCung() {
        danhSachSachGiaoKhoa.add(new SachGiaoKhoa("SGK001", new Date(), 50000, 10, "NXB Giáo dục", "mới"));
        danhSachSachGiaoKhoa.add(new SachGiaoKhoa("SGK002", new Date(), 45000, 15, "NXB Kim Đồng", "cũ"));
        danhSachSachThamKhao.add(new SachThamKhao("STK001", new Date(), 70000, 5, "NXB Khoa học", 5000));
        danhSachSachThamKhao.add(new SachThamKhao("STK002", new Date(), 65000, 8, "NXB Trẻ", 4000));
    }
}