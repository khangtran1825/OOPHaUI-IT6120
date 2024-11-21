package bai11_giangvien;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
	// Object's Properties
	protected double soTietDay;
	protected double donGia;

	/**
	 * Constructors
	 */
	public GVThinhGiang() {
		super();
	}

	public GVThinhGiang(double soTietDay, double donGia, String hoTen, String diaChi, String loaiGV) {
		super(hoTen, diaChi, loaiGV);
		this.soTietDay = soTietDay;
		this.donGia = donGia;
	}

	// Getters
	public double getSoTietDay() {
		return soTietDay;
	}

	public double getDonGia() {
		return donGia;
	}

	// Setters
	public void setSoTietDay(double soTietDay) {
		this.soTietDay = soTietDay;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	// Others
	@Override
	public String toString() {
		return "GVThinhGiang [soTietDay=" + soTietDay + ", donGia=" + donGia + "]";
	}

	@Override
	public double tinhLuong() {
		double phanTramThuNhap = (double) 15 / 100 * (soTietDay * donGia);
		double luongThang = soTietDay * donGia - phanTramThuNhap;
		return luongThang;
	}

	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so tiet day: ");
		soTietDay = sc.nextInt();
		System.out.print("\nNhap don gia: ");
		donGia = sc.nextDouble();
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.print("\t" + soTietDay + "\t" + donGia);
	}
}
