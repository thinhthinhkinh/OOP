package sudung_SET_GET_toString_hashCode_eQuals;

public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(31, 1, 2021);
		MyDate md1 = new MyDate(15, 5, 2025);
		MyDate md2 = new MyDate(11, 1, 2021);
		MyDate md3 = new MyDate(30, 3, 2030);
		System.out.println("Ngay: "+md.getNgay());
		md.printDate();
		md.setNgay(35);
		System.out.println("Ngay: "+md.getNgay());
		

		System.out.println("Month = "+ md.getThang());
		md.setThang(13);
		System.out.println("Month = "+ md.getThang());
		md.setThang(5);
		System.out.println("Month = "+ md.getThang());
		System.out.println("--------------");
		System.out.println(md);
		System.out.println(md1); // 15/5/2021
		System.out.println(md2);
		System.out.println(md3);
		
		//hashCode & eQuals
		System.out.println("md1 so sanh bang md2: "
                + md1.equals(md2));

		System.out.println("md1 so sanh bang md3: "
                + md1.equals(md3));

		System.out.println("Hashcode md1 " + md1.hashCode());
		System.out.println("Hashcode md2 " + md2.hashCode());
		System.out.println("Hashcode md3 " + md3.hashCode());
	}
}
