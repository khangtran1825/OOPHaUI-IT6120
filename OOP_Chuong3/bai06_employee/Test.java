package bai06_employee;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap so cong nhan: ");
			n = sc.nextInt();
		} while (n < 2 || n > 5);
		PartTimeEmployee dscn[] = new PartTimeEmployee[n];
		for (int i = 0; i < n; i++) {
			dscn[i] = new PartTimeEmployee();
			System.out.printf("\nNhap cong nhan thu %d: ", i + 1);
			dscn[i].input();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("\nCong nhan thu " + (i + 1));
			dscn[i].output();
		}
		sc.close();
	}
}
