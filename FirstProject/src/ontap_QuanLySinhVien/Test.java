package ontap_QuanLySinhVien;

import java.util.Scanner;

public class Test {
    private static HocSinhManager manager = new HocSinhManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        nhapCung();
        menu();
    }

    public static void nhapCung() {
        manager.themHocSinh(new Student("SV001", "Nguyễn Văn", "A", 8.5));
        manager.themHocSinh(new Student("SV002", "Trần Thị", "B", 7.5));
        manager.themHocSinh(new Student("SV003", "Lê Văn", "C", 9.0));
    }

    public static void nhapMem() {
        System.out.print("Nhập mã số sinh viên: ");
        String maSo = scanner.nextLine();
        System.out.print("Nhập họ: ");
        String ho = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        double diem = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng new line

        manager.themHocSinh(new Student(maSo, ho, ten, diem));
    }

    public static void inBangDanhSach() {
        Student[] danhSach = manager.getDanhSachHocSinh();
        int soLuong = manager.getSoLuongHocSinh();

        if (soLuong == 0) {
            System.out.println("Danh sách học sinh trống.");
            return;
        }

        System.out.println("\n--------------------------- DANH SÁCH HỌC SINH ---------------------------");
        System.out.printf("| %-5s | %-10s | %-20s | %-20s | %-5s |\n", "STT", "Mã số", "Họ", "Tên", "Điểm");
        System.out.println("|-------|------------|----------------------|----------------------|-------|");
        
        for (int i = 0; i < soLuong; i++) {
            Student hs = danhSach[i];
            System.out.printf("| %-5d | %-10s | %-20s | %-20s | %-5.2f |\n", 
                (i+1), hs.getMaSo(), hs.getHo(), hs.getTen(), hs.getDiem());
        }
        
        System.out.println("----------------------------------------------------------------------------");
    }

    public static void menu() {
        int luaChon;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Xem danh sách học sinh");
            System.out.println("2. Thêm học sinh (nhập mềm)");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Sửa thông tin học sinh");
            System.out.println("5. In bảng danh sách học sinh");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (luaChon) {
                case 1:
                    manager.xemDanhSach();
                    break;
                case 2:
                    nhapMem();
                    break;
                case 3:
                    System.out.print("Nhập mã số sinh viên cần xóa: ");
                    String maSoXoa = scanner.nextLine();
                    manager.xoaHocSinh(maSoXoa);
                    break;
                case 4:
                    System.out.print("Nhập mã số sinh viên cần sửa: ");
                    String maSoSua = scanner.nextLine();
                    manager.suaThongTin(maSoSua, scanner);
                    break;
                case 5:
                    inBangDanhSach();
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 0);
    }
}