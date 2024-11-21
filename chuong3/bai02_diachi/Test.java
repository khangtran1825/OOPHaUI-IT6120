package bai02_diachi;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so dia chi: ");
		int n = sc.nextInt();

		DiaChi dsdc[] = new DiaChi[n];
		for (int i = 0; i < n; i++) {
			dsdc[i] = new DiaChi();
			System.out.printf("\nNhap dia chi thu %d: ", i + 1);
			dsdc[i].nhap();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("\nDia chi thu " + (i + 1));
			dsdc[i].hienthi();
		}
		sc.close();
	}
}
