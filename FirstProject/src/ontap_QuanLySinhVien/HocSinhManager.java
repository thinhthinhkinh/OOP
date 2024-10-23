package ontap_QuanLySinhVien;

import java.util.Scanner;

public class HocSinhManager {
    private Student[] danhSachHocSinh;
    private int soLuongHocSinh;
    private static final int MAX_HOCSINH = 100;

    public HocSinhManager() {
        danhSachHocSinh = new Student[MAX_HOCSINH];
        soLuongHocSinh = 0;
    }

    public void themHocSinh(Student hocSinh) {
        if (soLuongHocSinh < MAX_HOCSINH) {
            danhSachHocSinh[soLuongHocSinh++] = hocSinh;
            System.out.println("Đã thêm học sinh thành công.");
        } else {
            System.out.println("Danh sách học sinh đã đầy.");
        }
    }

    public void xemDanhSach() {
        if (soLuongHocSinh == 0) {
            System.out.println("Danh sách học sinh trống.");
            return;
        }
        System.out.printf("%-5s | %-10s | %-20s | %-20s | %-5s\n", "STT", "Mã số", "Họ", "Tên", "Điểm");
        System.out.println("------------------------------------------------------------------------");
        for (int i = 0; i < soLuongHocSinh; i++) {
            Student hs = danhSachHocSinh[i];
            System.out.printf("%-5d | %-10s | %-20s | %-20s | %-5.2f\n", 
                (i+1), hs.getMaSo(), hs.getHo(), hs.getTen(), hs.getDiem());
        }
    }

    public void xoaHocSinh(String maSo) {
        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getMaSo().equals(maSo)) {
                for (int j = i; j < soLuongHocSinh - 1; j++) {
                    danhSachHocSinh[j] = danhSachHocSinh[j + 1];
                }
                soLuongHocSinh--;
                System.out.println("Đã xóa học sinh có mã số " + maSo);
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có mã số " + maSo);
    }

    public void suaThongTin(String maSo, Scanner scanner) {
        for (int i = 0; i < soLuongHocSinh; i++) {
            if (danhSachHocSinh[i].getMaSo().equals(maSo)) {
                System.out.print("Nhập họ mới: ");
                String hoMoi = scanner.nextLine();
                System.out.print("Nhập tên mới: ");
                String tenMoi = scanner.nextLine();
                System.out.print("Nhập điểm mới: ");
                double diemMoi = scanner.nextDouble();
                scanner.nextLine(); // Đọc bỏ dòng new line

                danhSachHocSinh[i].setHo(hoMoi);
                danhSachHocSinh[i].setTen(tenMoi);
                danhSachHocSinh[i].setDiem(diemMoi);
                System.out.println("Đã cập nhật thông tin học sinh có mã số " + maSo);
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có mã số " + maSo);
    }

    public Student[] getDanhSachHocSinh() {
        return danhSachHocSinh;
    }

    public int getSoLuongHocSinh() {
        return soLuongHocSinh;
    }
}