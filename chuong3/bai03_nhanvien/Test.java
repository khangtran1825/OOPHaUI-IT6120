package bai03_nhanvien;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so nhan vien: ");
		int n = sc.nextInt();

		NhanVien dsnv[] = new NhanVien[n];
		for (int i = 0; i < n; i++) {
			dsnv[i] = new NhanVien();
			System.out.printf("\nNhap nhan vien %d: ", i + 1);
			dsnv[i].nhap();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("\nNhan vien thu " + (i + 1));
			dsnv[i].hienthi();
		}
		sc.close();
	}
}
