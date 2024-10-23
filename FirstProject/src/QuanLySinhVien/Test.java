package QuanLySinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	private static Scanner sc = new Scanner(System.in);
	private static List<SinhVien> danhSachSV = new ArrayList<>();
	//nhapCung();
		private static void nhapCung() {
			Ngay ngay1 = new Ngay(1, 1, 2024);
			Ngay ngay2 = new Ngay(3, 3, 2024);
			Ngay ngay3 = new Ngay(3, 3, 2024);
	
			Lop lop1 = new Lop("DHTH19B", "Khoa Khoa Hoc & Ki Thuat May Tinh");
			Lop lop2 = new Lop("DHLKT19A", "Khoa Luat Co Ban");
			Lop lop3 = new Lop("DHCK19A", "Khoa Co Khi");
	
			SinhVien sv1 = new SinhVien("0001", "Tùng ITV", ngay1, 9.0, lop1);
			SinhVien sv2 = new SinhVien("0002", "Peter Le", ngay2, 4.0, lop2);
			SinhVien sv3 = new SinhVien("0003", "Lê Tùng", ngay3, 6.0, lop3);
		//them danhSachSV vao mang
			danhSachSV.add(sv1);
        	danhSachSV.add(sv2);
        	danhSachSV.add(sv3);
		}
		//Tim sinh vien theo maSV
		private static SinhVien timSinhVienTheoMa(String maSV) {
			for (SinhVien sv : danhSachSV) {
				if (sv.getMaSV().equals(maSV)) {
					return sv;
				}
			}
			return null;
		}
		public static void main(String[] args) {
			nhapCung();
			int luaChon;
			do {
				inMenu();
				luaChon = sc.nextInt();
	            sc.nextLine();
				switch(luaChon) {
					case 1:
						inDanhSachSinhVien();
						break;
					case 2:
						themSinhVien();
						break;
					case 3:
						suaSinhVien();
						break;
					case 4:
                    	xoaSinhVien();
                    	break;
					case 5:
                    	inKetQuaKiemTraThiDat();
                    	break;
                	case 6:
                    	kiemTraNgaySinh();
                    	break;
                	case 7:
                		nhapCung();
                		break;
                	case 0:
                    	System.out.println("Đã thoát chương trình!");
                    	break;
                	default:
                    System.out.println("Lựa chọn không hợp lệ!");
				}
					
			}while (luaChon != 0);
						
			sc.close();
		}
//		System.out.println("Ten khoa: ");
//		System.out.println("SV1: "+sv1.layTenKhoa());
//		System.out.println("SV2: "+sv2.layTenKhoa());
//		System.out.println("SV3: "+sv3.layTenKhoa());
//		
//		System.out.println("Kiem tra thi dat: ");
//		System.out.println("SV1: "+sv1.kiemTraThiDat());
//		System.out.println("SV2: "+sv2.kiemTraThiDat());
//		System.out.println("SV3: "+sv3.kiemTraThiDat());
//		
//		System.out.println("Kiem tra cung ngay sinh: ");
//		System.out.println("Sv2 va Sv3: "+sv2.cungNgaySinh(sv3));
//		System.out.println("Sv1 va Sv2: "+sv1.cungNgaySinh(sv2));
		
		//In menu
	    private static void inMenu() {
	        System.out.println("\n-------- MENU QUẢN LÝ SINH VIÊN --------");
	        System.out.println("1. Xem danh sách sinh viên");
	        System.out.println("2. Thêm sinh viên");
	        System.out.println("3. Sửa thông tin sinh viên");
	        System.out.println("4. Xóa sinh viên");
	        System.out.println("5. Xem kết quả thi");
	        System.out.println("6. Kiểm tra ngày sinh");
	        System.out.println("7. Nhập cứng");
	        System.out.println("0. Thoát");
	        System.out.print("Nhập lựa chọn của bạn: ");
	    }
	    //In danh sach sinh vien
	    private static void inDanhSachSinhVien() {
	        System.out.println("\nDANH SÁCH SINH VIÊN:");
	        System.out.println("-------------------------------------------------------------------------------");
	        System.out.println("| Mã SV  | Họ và Tên           | Ngày sinh  | Điểm TB | Khoa                         |");
	        System.out.println("-------------------------------------------------------------------------------");
	        
	        for (SinhVien sv : danhSachSV) {
	            System.out.printf("| %-6s | %-18s | %02d/%02d/%d | %6.2f | %-28s |\n",
	                    sv.getMaSV(),
	                    sv.getHoVaTen(),
	                    sv.getNgaySinh().getNgay(),
	                    sv.getNgaySinh().getThang(),
	                    sv.getNgaySinh().getNam(),
	                    sv.getDiemTB(),
	                    sv.getLop().getTenKhoa());
	        }
	        System.out.println("-------------------------------------------------------------------------------");
	    }
	    //Them sinh vien
	    private static void themSinhVien() {
	        System.out.println("\n----- THÊM SINH VIÊN MỚI -----");
	        
	        System.out.print("Nhập mã sinh viên: ");
	        String maSV = sc.nextLine();
	        
	        // Kiểm tra mã SV đã tồn tại
	        if (timSinhVienTheoMa(maSV) != null) {
	            System.out.println("Mã sinh viên đã tồn tại!");
	            return;
	        }
	        
	        System.out.print("Nhập họ và tên: ");
	        String hoTen = sc.nextLine();
	        
	        System.out.println("Nhập ngày sinh:");
	        System.out.print("Ngày: ");
	        int ngay = sc.nextInt();
	        System.out.print("Tháng: ");
	        int thang = sc.nextInt();
	        System.out.print("Năm: ");
	        int nam = sc.nextInt();
	        sc.nextLine(); // Xóa bộ nhớ đệm
	        
	        System.out.print("Nhập điểm trung bình: ");
	        double diemTB = sc.nextDouble();
	        sc.nextLine(); // Xóa bộ nhớ đệm
	        
	        System.out.print("Nhập tên lớp: ");
	        String tenLop = sc.nextLine();
	        
	        System.out.print("Nhập tên khoa: ");
	        String tenKhoa = sc.nextLine();
	        
	        Ngay ngaySinh = new Ngay(ngay, thang, nam);
	        Lop lop = new Lop(tenLop, tenKhoa);
	        SinhVien svMoi = new SinhVien(maSV, hoTen, ngaySinh, diemTB, lop);
	        
	        danhSachSV.add(svMoi);
	        System.out.println("Thêm sinh viên thành công!");
	    }
	    //In thong tin sinh vien
	    private static void inThongTinSinhVien(SinhVien sv) {
	        System.out.printf("Mã SV: %s\n", sv.getMaSV());
	        System.out.printf("Họ và tên: %s\n", sv.getHoVaTen());
	        System.out.printf("Ngày sinh: %d/%d/%d\n", 
	                sv.getNgaySinh().getNgay(),
	                sv.getNgaySinh().getThang(),
	                sv.getNgaySinh().getNam());
	        System.out.printf("Điểm TB: %.2f\n", sv.getDiemTB());
	        System.out.printf("Lớp: %s\n", sv.getLop().getTenLop());
	        System.out.printf("Khoa: %s\n", sv.getLop().getTenKhoa());
	    }
	    //Kiem tra ngay sinh
	    private static void kiemTraNgaySinh() {
	        System.out.println("\n----- KIỂM TRA NGÀY SINH -----");
	        
	        System.out.print("Nhập mã sinh viên thứ nhất: ");
	        String maSV1 = sc.nextLine();
	        System.out.print("Nhập mã sinh viên thứ hai: ");
	        String maSV2 = sc.nextLine();
	        
	        SinhVien sv1 = timSinhVienTheoMa(maSV1);
	        SinhVien sv2 = timSinhVienTheoMa(maSV2);
	        
	        if (sv1 == null || sv2 == null) {
	            System.out.println("Không tìm thấy một trong hai sinh viên!");
	            return;
	        }
	        
	        System.out.println("------------------------------------------------------------");
	        System.out.println("Sinh viên " + sv1.getHoVaTen() + " và " + sv2.getHoVaTen() + ": " +
	                (sv1.cungNgaySinh(sv2) ? "Cùng ngày sinh" : "Khác ngày sinh"));
	        System.out.println("------------------------------------------------------------");
	    }
	    //Kiem tra thi dat
	    private static void inKetQuaKiemTraThiDat() {
	        System.out.println("\nKẾT QUẢ THI:");
	        System.out.println("------------------------------------------------------------");
	        System.out.println("| Mã SV  | Họ và Tên           | Điểm TB | Kết quả        |");
	        System.out.println("------------------------------------------------------------");
	        
	        for (SinhVien sv : danhSachSV) {
	            System.out.printf("| %-6s | %-18s | %6.2f | %-14s |\n",
	                    sv.getMaSV(),
	                    sv.getHoVaTen(),
	                    sv.getDiemTB(),
	                    sv.kiemTraThiDat() ? "Đạt" : "Không đạt");
	        }
	        System.out.println("------------------------------------------------------------");
	    }
	    //Xoa sinh vien
	    private static void xoaSinhVien() {
	        System.out.println("\n----- XÓA SINH VIÊN -----");
	        
	        System.out.print("Nhập mã sinh viên cần xóa: ");
	        String maSV = sc.nextLine();
	        
	        SinhVien sv = timSinhVienTheoMa(maSV);
	        if (sv == null) {
	            System.out.println("Không tìm thấy sinh viên!");
	            return;
	        }
	        
	        System.out.println("Thông tin sinh viên sẽ xóa:");
	        inThongTinSinhVien(sv);
	        
	        System.out.print("Bạn có chắc muốn xóa? (Y/N): ");
	        String xacNhan = sc.nextLine();
	        
	        if (xacNhan.equalsIgnoreCase("Y")) {
	            danhSachSV.remove(sv);
	            System.out.println("Đã xóa sinh viên thành công!");
	        } else {
	            System.out.println("Đã hủy xóa sinh viên!");
	        }
	    }
	    //Sua sinh vien
	    private static void suaSinhVien() {
	        System.out.println("\n----- SỬA THÔNG TIN SINH VIÊN -----");
	        
	        System.out.print("Nhập mã sinh viên cần sửa: ");
	        String maSV = sc.nextLine();
	        
	        SinhVien sv = timSinhVienTheoMa(maSV);
	        if (sv == null) {
	            System.out.println("Không tìm thấy sinh viên!");
	            return;
	        }
	        
	        System.out.println("Thông tin sinh viên hiện tại:");
	        inThongTinSinhVien(sv);
	        
	        System.out.println("\nNhập thông tin mới (Enter để giữ nguyên):");
	        
	        System.out.print("Họ và tên mới: ");
	        String hoTen = sc.nextLine();
	        if (!hoTen.isEmpty()) {
	            sv.setHoVaTen(hoTen);
	        }
	        
	        System.out.print("Điểm trung bình mới (nhập -1 để giữ nguyên): ");
	        double diemTB = sc.nextDouble();
	        sc.nextLine(); // Xóa bộ nhớ đệm
	        if (diemTB != -1) {
	            sv.setDiemTB(diemTB);
	        }
	        
	        System.out.println("Cập nhật thành công!");
	    }
	    
	    
	      
}

