package bai10_hocvien;

import java.util.Scanner;

public class HocVienDH extends HocVien {
	// Object's Properties
	protected int soBuoi;
	protected int donGiaDH;

	public HocVienDH() {
		super();
	}

	public HocVienDH(int soBuoi, int donGiaDH, String hoTen, String diaChi, String loaiCT, int loaiUuTien) {
		super(hoTen, diaChi, loaiCT, loaiUuTien);
		this.soBuoi = soBuoi;
		this.donGiaDH = donGiaDH;
	}

	// Getters
	public int getSoBuoi() {
		return soBuoi;
	}

	public int getDonGiaDH() {
		return donGiaDH;
	}

	// Setters
	public void setSoBuoi(int soBuoi) {
		this.soBuoi = soBuoi;
	}

	public void setDonGiaDH(int donGiaDH) {
		this.donGiaDH = donGiaDH;
	}

	// Others
	@Override
	public String toString() {
		return "HocVienDH [soBuoi=" + soBuoi + ", donGiaLT=" + donGiaDH + "]";
	}

	@Override
	public int hocPhi() {
		int ut;
		if (loaiUuTien == 1)
			ut = 1000000;
		else if (loaiUuTien == 2)
			ut = 500000;
		else
			ut = 0;
		int hp = soBuoi * donGiaDH - ut;
		return hp;
	}

	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so buoi hoc: ");
		soBuoi = sc.nextInt();
		System.out.print("\nNhap don gia: ");
		donGiaDH = sc.nextInt();
	}

	public void inThongTin() {
		super.inThongTin();
		System.out.print("\nSo buoi hoc: " + soBuoi);
		System.out.println("\nDon gia: " + donGiaDH);

	}

}
