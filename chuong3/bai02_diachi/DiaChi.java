package bai02_diachi;

import java.util.Scanner;

public class DiaChi {
	// Object's Properties
	protected String thon;
	protected String xa;
	protected String huyen;
	protected String tinh;

	// Constructor Methods
	public DiaChi() {
		super();
	}

	public DiaChi(String thon, String xa, String huyen, String tinh) {
		super();
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}

	// Getter Methods
	public String getThon() {
		return thon;
	}

	public String getXa() {
		return xa;
	}

	public String getHuyen() {
		return huyen;
	}

	public String getTinh() {
		return tinh;
	}

	// Setter Methods
	public void setThon(String thon) {
		this.thon = thon;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}

	// Other Methods
	@Override
	public String toString() {
		return "DiaChi [thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]";
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten thon: ");
		thon = sc.nextLine();
		System.out.print("\nNhap ten xa: ");
		xa = sc.nextLine();
		System.out.print("\nNhap ten huyen: ");
		huyen = sc.nextLine();
		System.out.print("\nNhap ten tinh: ");
		tinh = sc.nextLine();
	}

	public void hienthi() {
		System.out.print("\nTen thon: " + thon);
		System.out.print("\nTen xa: " + xa);
		System.out.print("\nTen huyen: " + huyen);
		System.out.print("\nTen tinh: " + tinh);
	}

}
