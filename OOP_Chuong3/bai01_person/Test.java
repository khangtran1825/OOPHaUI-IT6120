package bai01_person;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so nguoi: ");
		int n = sc.nextInt();

		Person dsn[] = new Person[n];
		for (int i = 0; i < n; i++) {
			dsn[i] = new Person();
			System.out.printf("\nNhap nguoi %d: ", i + 1);
			dsn[i].nhap();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("\nNguoi thu " + (i + 1));
			dsn[i].hienthi();
		}
		sc.close();
	}

}
