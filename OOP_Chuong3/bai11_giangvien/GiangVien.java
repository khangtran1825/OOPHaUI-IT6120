package bai11_giangvien;

import java.util.Scanner;

public abstract class GiangVien {
	// Object's Properties
	protected String hoTen;
	protected String diaChi;
	protected String loaiGV;

	// Constructors
	public GiangVien() {
		super();
	}

	public GiangVien(String hoTen, String diaChi, String loaiGV) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGV = loaiGV;
	}

	// Abstract Method
	public abstract double tinhLuong();

	// Getters
	public String getHoTen() {
		return hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getLoaiGV() {
		return loaiGV;
	}

	// Setters
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setLoaiGV(String loaiGV) {
		this.loaiGV = loaiGV;
	}

	// Others
	@Override
	public String toString() {
		return "GiangVien [hoTen=" + hoTen + ", diaChi=" + diaChi + ", loaiGV=" + loaiGV + "]";
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("\nNhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.print("\nNhap loai GV: ");
		loaiGV = sc.nextLine();
	}

	public void inThongTin() {
		System.out.print("\n" + hoTen + "\t" + diaChi + "\t" + loaiGV + "\t" + tinhLuong());
	}
}
