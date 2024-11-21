package bai05_sinhvien;

import java.util.Scanner;

public class Nguoi {
	// Object's Properties
	protected String name;
	protected int tuoi;
	protected char gioiTinh;

	// Constructor Methods
	public Nguoi() {
		super();
	}

	public Nguoi(String name, int tuoi, char gioiTinh) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}

	// Getter Methods
	public String getName() {
		return name;
	}

	public int getTuoi() {
		return tuoi;
	}

	public char getGioiTinh() {
		return gioiTinh;
	}

	// Setter Methods
	public void setName(String name) {
		this.name = name;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	// Other Methods
	@Override
	public String toString() {
		return "Nguoi [name=" + name + ", age=" + tuoi + ", gender=" + gioiTinh + "]";
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten: ");
		name = sc.nextLine();
		System.out.print("Nhap age: ");
		tuoi = sc.nextInt();
		System.out.print("Nhap gioi tinh: ");
		gioiTinh = sc.next().charAt(0);
		sc.nextLine();
	}

	public void output() {
		System.out.print("\nTen: " + name);
		System.out.print("\nTuoi: " + tuoi);
		System.out.print("\nGioi tinh: " + gioiTinh);
	}
}
