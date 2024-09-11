package tuan6_QLThucPham;

public class TestHangThucPham {
    public static void main(String[] args) {
        // Tạo đối tượng HangThucPham với thông tin hợp lệ
        HangThucPham hang1 = new HangThucPham("001", "Gạo", 50000, "01/01/2023", "01/01/2024");
        System.out.println(hang1);
        System.out.println("Hàng đã hết hạn: " + hang1.isExpired());

        // Tạo đối tượng với thông tin không hợp lệ
        HangThucPham hang2 = new HangThucPham("002", "", -1000, "01/01/2023", "01/01/2022");
        System.out.println(hang2);
        System.out.println("Hàng đã hết hạn: " + hang2.isExpired());

        // Thay đổi thông tin hàng hóa
        hang2.setTenHang("Bột mì");
        hang2.setDonGia(30000);
        hang2.setNgayHetHan("01/01/2023");
        System.out.println(hang2);
        System.out.println("Hàng đã hết hạn: " + hang2.isExpired());
    }
}
