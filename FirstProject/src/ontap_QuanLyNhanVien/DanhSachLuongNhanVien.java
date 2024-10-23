package ontap_QuanLyNhanVien;

class DanhSachLuongNhanVien {
    private LuongNhanVien[] danhSach;
    private int count;

    public DanhSachLuongNhanVien(int size) {
        danhSach = new LuongNhanVien[size];
        count = 0;
    }

    public void them(LuongNhanVien luongNhanVien) {
        if (count < danhSach.length) {
            danhSach[count++] = luongNhanVien;
        } else {
            System.out.println("Danh sach da day!");
        }
    }

    public void xoa(String maNhanVien) {
        for (int i = 0; i < count; i++) {
            if (danhSach[i].getMaNhanVien().equals(maNhanVien)) {
                danhSach[i] = danhSach[count - 1]; // Đưa phần tử cuối vào vị trí xóa
                danhSach[count - 1] = null; // Đặt null vào vị trí cuối
                count--;
                System.out.println("Xóa thành công nhân viên: " + maNhanVien);
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với mã: " + maNhanVien);
    }

    public void sua(String maNhanVien, int soSanPham) {
        for (int i = 0; i < count; i++) {
            if (danhSach[i].getMaNhanVien().equals(maNhanVien)) {
                danhSach[i].setSoSanPham(soSanPham);
                System.out.println("Sửa thành công thông tin nhân viên: " + maNhanVien);
                return;
            }
        }
        System.out.println("Không tìm thấy nhân viên với mã: " + maNhanVien);
    }

    public void hienThiDanhSach() {
        System.out.printf("%-15s %-10s %-10s %-15s %-10s%n", "Mã NV", "Tháng", "Năm", "Số SP", "Lương");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(danhSach[i].toString());
        }
    }

    public void nhapCungThongTin() {
        them(new LuongNhanVien("NV001", 10, 2024, 100));
        them(new LuongNhanVien("NV002", 10, 2024, 150));
        them(new LuongNhanVien("NV003", 10, 2024, 200));
        System.out.println("Đã thêm thông tin cứng cho nhân viên.");
    }
}