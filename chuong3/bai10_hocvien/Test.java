package bai10_hocvien;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HocVienDH hvdh = new HocVienDH();
		HocVienLT hvlt = new HocVienLT();

		System.out.println("Nhap: ");
		hvdh.nhapThongTin();
		hvlt.nhapThongTin();

		System.out.println("Hien thi: ");
		hvdh.inThongTin();
		hvlt.inThongTin();

		sc.close();
	}
}
