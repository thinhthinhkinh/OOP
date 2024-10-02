package tuan10_GiaoDich;
 
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {
    private float TiGia;
    private int LoaiTienTe;
    private Scanner in = new Scanner(System.in);

    // Constructor mặc định
    public GiaoDichTienTe() {
        super();
        this.TiGia = 0;
        this.LoaiTienTe = 0;
    }

    // Constructor có tham số
    public GiaoDichTienTe(int ma, int sl, String ngay, double dgia, double ttien, float tgia, int loai) {
        super(ma, sl, ngay, dgia, ttien);
        this.TiGia = tgia;
        this.LoaiTienTe = loai;
    }

    // Getter và Setter cho TiGia
    public float getTiGia() {
        return TiGia;
    }

    public void setTiGia(float tiGia) {
        TiGia = tiGia;
    }

    // Getter và Setter cho LoaiTienTe
    public int getLoaiTienTe() {
        return LoaiTienTe;
    }

    public void setLoaiTienTe(int loaiTienTe) {
        LoaiTienTe = loaiTienTe;
    }

    // Phương thức nhập thông tin giao dịch tiền tệ
    @Override
    public void nhap() {
        super.nhap(); // Gọi phương thức nhập từ lớp cha
        System.out.print("Ti Gia: ");
        TiGia = in.nextFloat();
        System.out.print("Loai Tien Te (1: VND, 2: USD, 3: EURO): ");
        LoaiTienTe = in.nextInt();
    }

    // Tính thành tiền cho giao dịch tiền tệ
    @Override
    public double tinhThanhTien() {
        if (LoaiTienTe == 1) {
            return this.ThanhTien = this.DonGia * this.SoLuong;
        } else {
            return this.ThanhTien = this.DonGia * this.SoLuong * this.TiGia;
        }
    }

    // Phương thức toString
    @Override
    public String toString() {
        String temp;
        switch (LoaiTienTe) {
            case 1:
                temp = "VND";
                break;
            case 2:
                temp = "USD";
                break;
            case 3:
                temp = "EURO";
                break;
            default:
                temp = "Khong Xac Dinh";
                break;
        }
        return "Giao Dich Tien Te: " + super.toString() + ", Ti Gia: " + TiGia + ", Loai Tien Te: " + temp + ", ThanhTien: " + ThanhTien + "]";
    }
}
