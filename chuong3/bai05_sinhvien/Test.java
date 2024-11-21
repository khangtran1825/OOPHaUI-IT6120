package bai05_sinhvien;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so sinh vien: ");
			n = sc.nextInt();
		} while (n < 2 || n > 5);
		SinhVien dssv[] = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			dssv[i] = new SinhVien();
			System.out.printf("\nNhap sv thu %d: ", i + 1);
			dssv[i].input();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("\nSinh vien thu " + (i + 1));
			dssv[i].output();
		}
		sc.close();
	}
}
