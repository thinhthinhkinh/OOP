package tuan10_GiaoDich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private List<GiaoDich> danhSachGiaoDich;
    private Scanner in;

    public Test() {
        danhSachGiaoDich = new ArrayList<>();
        in = new Scanner(System.in);
    }

    // Nhập cứng các giao dịch
    public void nhapCung() {
        // Nhập giao dịch vàng
        GiaoDichVang gdVang = new GiaoDichVang(1, 10, "2024-09-29", 500000, 0, "Vang 9999");
        gdVang.tinhThanhTien();
        danhSachGiaoDich.add(gdVang);

        // Nhập giao dịch tiền tệ
        GiaoDichTienTe gdTienTe = new GiaoDichTienTe(2, 5, "2024-09-30", 20000, 0, 23000, 2);
        gdTienTe.tinhThanhTien();
        danhSachGiaoDich.add(gdTienTe);
    }

    // Nhập mềm các giao dịch
    public void nhapMem() {
        System.out.print("Nhap so luong giao dich: ");
        int soLuong = in.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Chon loai giao dich (1: Vang, 2: Tien Te): ");
            int loai = in.nextInt();
            if (loai == 1) {
                GiaoDichVang gdVang = new GiaoDichVang();
                gdVang.nhap();
                gdVang.tinhThanhTien();
                danhSachGiaoDich.add(gdVang);
            } else if (loai == 2) {
                GiaoDichTienTe gdTienTe = new GiaoDichTienTe();
                gdTienTe.nhap();
                gdTienTe.tinhThanhTien();
                danhSachGiaoDich.add(gdTienTe);
            } else {
                System.out.println("Loai giao dich khong hop le!");
            }
        }
    }

    // Hiển thị danh sách giao dịch
    public void hienThiDanhSach() {
        for (GiaoDich gd : danhSachGiaoDich) {
            System.out.println(gd);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.nhapCung(); // Nhập cứng
        test.nhapMem();  // Nhập mềm
        test.hienThiDanhSach(); // Hiển thị danh sách giao dịch
    }
}
