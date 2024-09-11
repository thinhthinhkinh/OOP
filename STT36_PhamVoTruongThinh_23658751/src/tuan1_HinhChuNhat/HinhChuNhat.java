package tuan1_HinhChuNhat;

import java.util.Scanner;

public class HinhChuNhat {
		private double chieudai;
		private double chieurong;
	public double getChieudai() {
		return chieudai;
	}
	public void setChieudai(double dai) {
		this.chieudai = dai;
	}
	public double getChieurong() {
		return chieurong;
	}
	public void setChieurong(double rong) {
		this.chieurong = rong;
	}
	//tao constructor
	public HinhChuNhat() {}
	public HinhChuNhat(double dai, double rong) {
		this.chieudai= dai;
		this.chieurong= rong;
	}
	//xay dung method
	public double getChuvi() {
		return (getChieudai()+getChieurong())*2;
	}
	public double getDientich() {
		return (getChieudai()* getChieurong());
	}
	@Override
	public String toString() {
	// TODO Auto-generated method stub
		return super.toString();
	}
	public static void main(String[] args) {
		 HinhChuNhat hcn1= new HinhChuNhat();
		 hcn1.setChieudai(5);
		 hcn1.setChieurong(3);
		 System.out.println("Chieu dai HCN la: "+hcn1.getChieudai());
		 System.out.println("Chieu rong HCN la: "+hcn1.getChieurong());
		 System.out.println("Chu vi HCN la: "+hcn1.getChuvi());
		 System.out.println("Dien tich HCN la: "+hcn1.getDientich());
		 
		 HinhChuNhat hcn2= new HinhChuNhat();
		 hcn1.setChieudai(10);
		 hcn1.setChieurong(6);
		 System.out.println("Chieu dai HCN la: "+hcn2.getChieudai());
		 System.out.println("Chieu rong HCN la: "+hcn2.getChieurong());
		 System.out.println("Chu vi HCN la: "+hcn2.getChuvi());
		 System.out.println("Dien tich HCN la: "+hcn2.getDientich());
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap chieu dai HCN: ");
		 double d =sc.nextDouble();
		 hcn1.setChieudai(d);
		 double r =sc.nextDouble();
		 hcn1.setChieurong(r);
		 System.out.println("Chieu dai HCN la: "+hcn1.getChieudai());
		 System.out.println("Chieu rong HCN la: "+hcn1.getChieurong());
		 System.out.println("Chu vi HCN la: "+hcn1.getChuvi());
		 System.out.println("Dien tich HCN la: "+hcn1.getDientich());
		 
		 
		 
	}
	
}

