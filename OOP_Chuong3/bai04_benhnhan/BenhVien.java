package bai04_benhnhan;

import java.util.Scanner;

public class BenhVien {
	// Object's Properties
	protected String ten;
	protected String diaChi;
	protected String giamDoc;

	// Constructor Methods
	public BenhVien() {
		super();
	}

	public BenhVien(String ten, String diaChi, String giamDoc) {
		super();
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}

	// Getter Methods
	public String getTen() {
		return ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	// Setter Methods
	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}

	// Other Methods
	@Override
	public String toString() {
		return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + giamDoc + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten benh vien: ");
		ten = sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.print("Nhap giam doc: ");
		giamDoc = sc.nextLine();
		;
	}

	public void output() {
		System.out.print("\nTen benh vien: " + ten);
		System.out.print("\nDia chi: " + diaChi);
		System.out.print("\nTen giam doc: " + giamDoc);
	}
}
