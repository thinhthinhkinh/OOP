package tuan10_GiaoDich;

import java.util.ArrayList;
import java.util.List;

public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public void hienThiDanhSach() {
        for (GiaoDich gd : danhSachGiaoDich) {
            System.out.println("Mã Giao Dịch: " + gd.getMaGD() + ", Thành Tiền: " + gd.getThanhTien());
        }
    }

    public int tongSoLuongGiaoDich() {
        int tong = 0;
        for (GiaoDich gd : danhSachGiaoDich) {
            tong += gd.getSoLuong();
        }
        return tong;
    }

    public double tinhTrungBinhThanhTienNgoaiTe() {
        double tongThanhTien = 0;
        int count = 0;
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd instanceof GiaoDichTienTe) {
                tongThanhTien += gd.getThanhTien();
                count++;
            }
        }
        return count > 0 ? tongThanhTien / count : 0;
    }

    public void hienThiGiaoDichLonHon1Ty() {
        for (GiaoDich gd : danhSachGiaoDich) {
            if (gd.getThanhTien() > 1_000_000_000) {
                System.out.println("Giao dịch lớn hơn 1 tỷ: " + gd.getMaGD());
            }
        }
    }
}
