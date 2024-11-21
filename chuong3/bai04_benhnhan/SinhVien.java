package bai04_benhnhan;

import java.util.Scanner;

public class SinhVien extends Nguoi {
	// Object's Properties
	protected String tienSu;
	protected String chanDoan;
	protected BenhVien benhVien;

	// Constructor Methods
	public SinhVien() {
		super();
	}

	public SinhVien(String tienSu, String chanDoan, BenhVien benhVien, String ten, int tuoi, char gioiTinh) {
		super(ten, tuoi, gioiTinh);
		this.tienSu = tienSu;
		this.chanDoan = chanDoan;
		this.benhVien = benhVien;
	}

	// Getter Methods
	public String getTienSu() {
		return tienSu;
	}

	public String getChanDoan() {
		return chanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	// Setter Methods
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}

	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}

	// Other Methods
	@Override
	public String toString() {
		return "SinhVien [tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("\nNhap tien su: ");
		tienSu = sc.nextLine();
		System.out.print("Nhap chan doan: ");
		chanDoan = sc.nextLine();
		System.out.print("Nhap benh vien: ");
		BenhVien bv = new BenhVien();
		bv.input();
		benhVien = bv;
	}

	public void output() {
		super.output();
		System.out.print("\nTien su: " + tienSu);
		System.out.print("\nChan doan: " + chanDoan);
		System.out.print("\nBenh vien: " + benhVien);
	}
}
