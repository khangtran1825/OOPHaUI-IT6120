package bai10_hocvien;

import java.util.Scanner;

public class HocVienLT extends HocVien {
	// Object's Properties
	protected int soBuoi;
	protected int donGiaLT;

	public HocVienLT() {
		super();
	}

	public HocVienLT(int soBuoi, int donGiaLT, String hoTen, String diaChi, String loaiCT, int loaiUuTien) {
		super(hoTen, diaChi, loaiCT, loaiUuTien);
		this.soBuoi = soBuoi;
		this.donGiaLT = donGiaLT;
	}

	// Getters
	public int getSoBuoi() {
		return soBuoi;
	}

	public int getDonGiaLT() {
		return donGiaLT;
	}

	// Setters
	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}

	public void setDonGiaLT(int donGiaDH) {
		this.donGiaLT = donGiaDH;
	}

	// Others
	@Override
	public String toString() {
		return "HocVienDH [soBuoi=" + soBuoi + ", donGiaLT=" + donGiaLT + "]";
	}

	@Override
	public int hocPhi() {
		int ut;
		if (loaiUuTien == 1)
			ut = 1000000;
		else if (loaiUuTien == 2)
			ut = 800000;
		else
			ut = 0;
		int hp = soBuoi * donGiaLT - ut;
		return hp;
	}

	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so buoi hoc: ");
		soBuoi = sc.nextInt();
		System.out.print("\nNhap don gia: ");
		donGiaLT = sc.nextInt();
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.print("\nSo buoi hoc: " + soBuoi);
		System.out.println("\nDon gia: " + donGiaLT);

	}

}
