package bai04_benhnhan;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so benh nhan: ");
			n = sc.nextInt();
		} while (n < 2 || n > 5);
		SinhVien dsbn[] = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			dsbn[i] = new SinhVien();
			System.out.printf("\nNhap benh nhan thu %d: ", i + 1);
			dsbn[i].input();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("\nBenh nhan thu " + (i + 1));
			dsbn[i].output();
		}
		sc.close();
	}
}
