package bai10_hocvien;

import java.util.Scanner;

public abstract class HocVien {
	// Object's Properties
	protected String hoTen;
	protected String diaChi;
	protected String loaiCT;
	protected int loaiUuTien;

	// Abstract Method
	public abstract int hocPhi();

	// Constructor Methods
	public HocVien() {
		super();
	}

	public HocVien(String hoTen, String diaChi, String loaiCT, int loaiUuTien) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCT = loaiCT;
		this.loaiUuTien = loaiUuTien;
	}

	// Others
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("\nNhap dia chi: ");
		diaChi = sc.nextLine();
		while (true) {
			System.out.print("\nNhap loai uu tien(1 hoac 2): ");
			loaiUuTien = sc.nextInt();
			if (loaiUuTien == 1 || loaiUuTien == 2)
				break;
		}
		sc.nextLine();
		System.out.print("\nNhap chuong trinh hoc: ");
		loaiCT = sc.nextLine();
	}

	public void inThongTin() {
		System.out.print("\nHo ten: " + hoTen);
		System.out.println("\nDia chi: " + diaChi);
		System.out.println("Loai uu tien: " + loaiUuTien);
		System.out.println("Loai chuong trinh: " + loaiCT);
		System.out.println("Hoc phi: " + hocPhi());
	}
}
