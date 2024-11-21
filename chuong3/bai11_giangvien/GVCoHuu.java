package bai11_giangvien;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	// Object's Properties
	protected double luongCB;
	protected double hsl;
	protected int namCongTac;

	// Constructors
	public GVCoHuu() {
		super();
	}

	public GVCoHuu(double luongCB, double hsl, int namCongTac, String hoTen, String diaChi, String loaiGV) {
		super(hoTen, diaChi, loaiGV);
		this.luongCB = luongCB;
		this.hsl = hsl;
		this.namCongTac = namCongTac;
	}

	// Getters
	public double getLuongCB() {
		return luongCB;
	}

	public double getHsl() {
		return hsl;
	}

	public int getNamCongTac() {
		return namCongTac;
	}

	// Setters
	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}

	public void setHsl(double hsl) {
		this.hsl = hsl;
	}

	public void setNamCongTac(int namCongTac) {
		this.namCongTac = namCongTac;
	}

	// Others
	@Override
	public String toString() {
		return "GVCoHuu [luongCB=" + luongCB + ", hsl=" + hsl + ", namCongTac=" + namCongTac + "]";
	}

	@Override
	public double tinhLuong() {
		double phanTramPhuCap;
		if (namCongTac < 5)
			phanTramPhuCap = 0;
		else
			phanTramPhuCap = (double) namCongTac / 100;
		double phuCap = phanTramPhuCap * luongCB;
		double luongThang = luongCB * hsl + phuCap;
		return luongThang;
	}

	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap luong co ban: ");
		luongCB = sc.nextDouble();
		System.out.print("\nNhap he so luong: ");
		hsl = sc.nextDouble();
		System.out.print("\nNhap nam cong tac: ");
		namCongTac = sc.nextInt();
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.print("\t" + luongCB + "\t" + hsl + "\t" + namCongTac);
	}
}
