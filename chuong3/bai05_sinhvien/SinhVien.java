package bai05_sinhvien;

import java.util.Scanner;

public class SinhVien extends Nguoi {
	// Object's Properties
	protected String lop;
	protected String nganh;
	protected Truong truong;

	// Constructor Methods
	public SinhVien() {
		super();
	}

	public SinhVien(String lop, String nganh, Truong truong, String ten, int tuoi, char gioiTinh) {
		super(ten, tuoi, gioiTinh);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}

	// Getter Methods
	public String getLop() {
		return lop;
	}

	public String getNganh() {
		return nganh;
	}

	public Truong getTruong() {
		return truong;
	}

	// Setter Methods
	public void setLop(String lop) {
		this.lop = lop;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public void setTruong(Truong truong) {
		this.truong = truong;
	}

	// Other Methods
	@Override
	public String toString() {
		return "SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("\nNhap lop: ");
		lop = sc.nextLine();
		System.out.print("Nhap nganh: ");
		nganh = sc.nextLine();
		System.out.print("Nhap truong: ");
		Truong t = new Truong();
		t.input();
		truong = t;
	}

	public void output() {
		super.output();
		System.out.print("\nLop: " + lop);
		System.out.print("\nNganh: " + nganh);
		System.out.print("\nTruong: " + truong);
	}
}
