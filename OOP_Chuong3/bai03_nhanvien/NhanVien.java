package bai03_nhanvien;

import java.util.Scanner;

public class NhanVien {
	// Object's Properties
	protected String name;
	protected DiaChi address;
	protected String dob;
	protected char gender;

	// Constructor Methods
	public NhanVien() {
	}

	public NhanVien(String name, DiaChi address, String dob, char gender) {
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
	}

	// Getter Methods
	public String getName() {
		return name;
	}

	public DiaChi getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}

	public char getGender() {
		return gender;
	}

	// Setter Methods
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(DiaChi address) {
		this.address = address;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// Other Methods
	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", address=" + address + ", dob=" + dob + ", gender=" + gender + "]";
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten nhan vien: ");
		name = sc.nextLine();
		System.out.print("\nNhap dia chi: ");
		DiaChi dc = new DiaChi();
		dc.nhap();
		address = dc;
		System.out.print("\nNhap ngay sinh: ");
		dob = sc.nextLine();
		System.out.print("\nNhap gioi tinh: ");
		gender = sc.next().charAt(0);
		sc.nextLine();
	}

	public void hienthi() {
		System.out.print("\nTen nhan vien: " + name);
		System.out.print("\nDia chi: " + address);
		System.out.print("\nNgay sinh: " + dob);
		System.out.print("\nGioi tinh: " + gender);
	}

}
