package ontap_QuanLyNhanVien;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachLuongNhanVien danhSach = new DanhSachLuongNhanVien(5);
        int luaChon;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. In danh sách nhân viên");
            System.out.println("5. Nhập cứng thông tin");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới

            switch (luaChon) {
                case 1:
                    System.out.print("Nhập mã nhân viên: ");
                    String maNV = scanner.nextLine();
                    System.out.print("Nhập tháng: ");
                    int thang = scanner.nextInt();
                    System.out.print("Nhập năm: ");
                    int nam = scanner.nextInt();
                    System.out.print("Nhập số sản phẩm: ");
                    int soSP = scanner.nextInt();
                    danhSach.them(new LuongNhanVien(maNV, thang, nam, soSP));
                    break;

                case 2:
                    System.out.print("Nhập mã nhân viên cần xóa: ");
                    String maXoa = scanner.nextLine();
                    danhSach.xoa(maXoa);
                    break;

                case 3:
                    System.out.print("Nhập mã nhân viên cần sửa: ");
                    String maSua = scanner.nextLine();
                    System.out.print("Nhập số sản phẩm mới: ");
                    int soSanPhamMoi = scanner.nextInt();
                    danhSach.sua(maSua, soSanPhamMoi);
                    break;

                case 4:
                    danhSach.hienThiDanhSach();
                    break;

                case 5:
                    danhSach.nhapCungThongTin();
                    break;

                case 6:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (luaChon != 6);

        scanner.close();
    }
    
}