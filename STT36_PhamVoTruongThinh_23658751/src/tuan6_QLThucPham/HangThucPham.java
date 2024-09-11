package tuan6_QLThucPham;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private final String maHang; // Mã hàng (không cho phép sửa, không được để rỗng)
    private String tenHang; // Tên hàng (không được để rỗng)
    private double donGia; // Đơn giá (>0)
    private Date ngaySanXuat; // Ngày sản xuất (không được để rỗng)
    private Date ngayHetHan; // Ngày hết hạn (phải sau ngày sản xuất)

    // Định dạng ngày
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    // Định dạng đơn giá
    private static final DecimalFormat priceFormat = new DecimalFormat("#,###.##");

    // Constructor có đầy đủ tham số
    public HangThucPham(String maHang, String tenHang, double donGia, String ngaySanXuat, String ngayHetHan) {
        if (maHang == null || maHang.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để rỗng.");
        }
        this.maHang = maHang;

        if (tenHang == null || tenHang.isEmpty()) {
            throw new IllegalArgumentException("Tên hàng không được để rỗng.");
        }
        this.tenHang = tenHang;

        if (donGia <= 0) {
            throw new IllegalArgumentException("Đơn giá phải lớn hơn 0.");
        }
        this.donGia = donGia;

        try {
            this.ngaySanXuat = dateFormat.parse(ngaySanXuat);
            this.ngayHetHan = dateFormat.parse(ngayHetHan);
            if (this.ngayHetHan.before(this.ngaySanXuat)) {
                throw new IllegalArgumentException("Ngày hết hạn phải sau ngày sản xuất.");
            }
        } catch (ParseException e) {
            throw new IllegalArgumentException("Ngày không hợp lệ, vui lòng sử dụng định dạng dd/MM/yyyy.");
        }
    }

    // Constructor chỉ có mã hàng
    public HangThucPham(String maHang) {
        this(maHang, "UNKNOWN", 0.0, "01/01/2000", "02/01/2000");
    }

    // Phương thức setters/getters
    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang == null || tenHang.isEmpty()) {
            throw new IllegalArgumentException("Tên hàng không được để rỗng.");
        }
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia <= 0) {
            throw new IllegalArgumentException("Đơn giá phải lớn hơn 0.");
        }
        this.donGia = donGia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        try {
            this.ngaySanXuat = dateFormat.parse(ngaySanXuat);
            if (ngayHetHan != null && ngayHetHan.before(this.ngaySanXuat)) {
                throw new IllegalArgumentException("Ngày hết hạn phải sau ngày sản xuất.");
            }
        } catch (ParseException e) {
            throw new IllegalArgumentException("Ngày không hợp lệ, vui lòng sử dụng định dạng dd/MM/yyyy.");
        }
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(String ngayHetHan) {
        try {
            Date tempDate = dateFormat.parse(ngayHetHan);
            if (tempDate.before(ngaySanXuat)) {
                throw new IllegalArgumentException("Ngày hết hạn phải sau ngày sản xuất.");
            }
            this.ngayHetHan = tempDate;
        } catch (ParseException e) {
            throw new IllegalArgumentException("Ngày không hợp lệ, vui lòng sử dụng định dạng dd/MM/yyyy.");
        }
    }

    // Phương thức kiểm tra hàng thực phẩm đã hết hạn chưa
    public boolean isExpired() {
        return new Date().after(ngayHetHan);
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Mã hàng: " + maHang +
               ", Tên hàng: " + tenHang +
               ", Đơn giá: " + priceFormat.format(donGia) +
               ", Ngày sản xuất: " + dateFormat.format(ngaySanXuat) +
               ", Ngày hết hạn: " + dateFormat.format(ngayHetHan);
    }
}
