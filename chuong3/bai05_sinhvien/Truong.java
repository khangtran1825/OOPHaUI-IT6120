package bai05_sinhvien;

import java.util.Scanner;

public class Truong {
	// Object's Properties
	protected String ten;
	protected String diaChi;
	protected String hieuTruong;

	// Constructor Methods
	public Truong() {
		super();
	}

	public Truong(String ten, String diaChi, String hieuTruong) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}

	// Getter Methods
	public String getTen() {
		return ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getHieuTruong() {
		return hieuTruong;
	}

	// Setter Methods
	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setHieuTruong(String giamDoc) {
		this.hieuTruong = giamDoc;
	}

	// Other Methods
	@Override
	public String toString() {
		return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten truong: ");
		ten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.print("Nhap hieu truong: ");
		hieuTruong = sc.nextLine();
		;
	}

	public void output() {
		System.out.print("\nTen benh vien: " + ten);
		System.out.print("\nDia chi: " + diaChi);
		System.out.print("\nTen hieu truong: " + hieuTruong);
	}
}
